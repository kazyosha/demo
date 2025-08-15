package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeServlet {
    @GetMapping({"/", "/home"})
    public String showHomePage() {
        return "home-page/home";
    }
}
