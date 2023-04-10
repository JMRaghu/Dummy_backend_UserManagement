package com.microservice.usermanagement.controller;

import com.microservice.usermanagement.dao.ResponseDao;
import com.microservice.usermanagement.entity.User;
import com.microservice.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/users/authenticate")
    public ResponseDao authenticateUser(@RequestBody User user){
        return service.authenticateUser(user.getEmail(), user.getPassword());
    }

    @PostMapping("/users")
    public ResponseDao createUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return service.getAllUsers();
    }
}
