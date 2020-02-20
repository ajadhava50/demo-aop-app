package com.example.aop.demoaopapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping("/user/{username}")
    public String getResource(@PathVariable String username){
        String msg=service.getResource(username);
        return msg;
    }


    @PostMapping("/user/")
    public User createResource(@RequestBody User user){
        User user1 = service.createResource(user);
        return user1 ;
    }

}
