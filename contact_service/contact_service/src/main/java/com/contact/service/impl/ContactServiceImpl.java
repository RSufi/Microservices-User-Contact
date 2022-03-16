package com.contact.service.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.contact.entity.Contact;
import com.contact.service.ContactService;

import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> list = List.of(
            new Contact(1L, "sufirain@gmail.com", "Sufi", 1111L),
            new Contact(2L, "farida@gmail.com", "Farida", 1111L),
            new Contact(3L, "farida@gmail.com", "Farida", 1112L),
            new Contact(4L, "Sana@gmail.com", "Sana", 1113L));

    @Override
    public List<Contact> getContactOfUser(Long userId) {

        return list.stream().filter(Contact -> Contact.getUserId().equals(userId)).collect(Collectors.toList());
    }

}
