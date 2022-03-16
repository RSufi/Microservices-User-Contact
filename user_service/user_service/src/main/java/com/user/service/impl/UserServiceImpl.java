package com.user.service.impl;

import java.util.List;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    List<User> list = List.of(
            new User(1111L, "Sufi", "9078675646"),
            new User(1112L, "Farida", "8976897989"),
            new User(1113L, "Akhir", "8976090000"));

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }

}
