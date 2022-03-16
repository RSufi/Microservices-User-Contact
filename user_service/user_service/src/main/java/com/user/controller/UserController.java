package com.user.controller;

import java.util.List;

import com.user.entity.User;
import com.user.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.Generated;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long id) {

        User user = this.userService.getUser(id);
        // localhost:9002/contact/1111
        List contacts = this.restTemplate.getForObject("http://contact-service/contact/" + user.getUserId(),
                List.class);
        user.setContacts(contacts);
        return user;
    }

}
