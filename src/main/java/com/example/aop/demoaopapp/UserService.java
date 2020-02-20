package com.example.aop.demoaopapp;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserService {

    public String getResource(String username){
        return "Hi "+username;
    }


    public User createResource(User user){

        user.setName("update user");

        return user ;
    }

}
