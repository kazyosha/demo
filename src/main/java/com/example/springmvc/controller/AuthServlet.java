package com.example.springmvc.controller;

import com.example.springmvc.service.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/auth")
public class AuthServlet {

    private AuthService authService;

    public AuthServlet(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/login")
    public String showFormLogin(@RequestParam(value = "error", required = false) String error,
                                Model model) {
        if (error != null) {
            model.addAttribute("error", "Invalid username or password");
        }
        return "auth/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password) {
        if (!authService.login(username, password)) {
            return "redirect:/auth/login?error=true";
        }
        return "redirect:/home";
    }

    @GetMapping("/register")
    public String showFormRegister() {
        return "auth/register";
    }
}
