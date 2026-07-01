package com.ospa.auth.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/auth/login")
public class LoginController {

    @PostMapping("/")
    public String login(@RequestParam String username, @RequestParam String password) {
        
        return "Login successful for user: " + username;    
    }
}
