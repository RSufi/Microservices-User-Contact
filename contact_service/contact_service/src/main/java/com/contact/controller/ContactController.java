package com.contact.controller;

import java.util.List;

import com.contact.entity.Contact;
import com.contact.service.impl.ContactServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactServiceImpl contactServiceImpl;

    @GetMapping("/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId){
        return this.contactServiceImpl.getContactOfUser(userId);
    }
    
}
