package com.user.entity;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
@Data
public class User {

     Long userId;
    String name;
    String phone;

    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

   
    List<Contact> contacts=new ArrayList<>();

    public User() {
        
    }


}
