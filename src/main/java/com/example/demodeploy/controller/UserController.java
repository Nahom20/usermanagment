package com.example.demodeploy.controller;
import com.example.demodeploy.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demodeploy.service.Userservice;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final Userservice Userservice;


    @GetMapping
    public List<User> getUsers() {
        return Userservice.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return Userservice.saveUser(user);
    }
}

