package com.example.springmvc.service;

import com.example.springmvc.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User(1, "admin", "123456", "ADMIN", "admin@example.com", "0123456789"));
        users.add(new User(2, "john", "123456", "USER", "john@example.com", "0987654321"));
        users.add(new User(3, "mary", "123456", "USER", "mary@example.com", "0912345678"));
        users.add(new User(4, "peter", "123456", "USER", "peter@example.com", "0901234567"));

        return users;
    }
}
