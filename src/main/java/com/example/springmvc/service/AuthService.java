package com.example.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public boolean login(String username, String password) {
        if (username.equals("admin") && password.equals("1234")) {
            return true;
        }
        return false;
    }
}
