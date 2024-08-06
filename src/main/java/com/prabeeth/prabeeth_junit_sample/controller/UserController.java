package com.prabeeth.prabeeth_junit_sample.controller;


import com.prabeeth.prabeeth_junit_sample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/")
    public boolean createUser(@RequestBody String name) {
        return userService.createUser(name);
    }
}