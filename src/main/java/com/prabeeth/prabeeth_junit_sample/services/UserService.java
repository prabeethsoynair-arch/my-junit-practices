package com.prabeeth.prabeeth_junit_sample.services;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserById(int id) {
        return "User" + id;
    }

    public boolean createUser(String name) {
        return true;
    }
}