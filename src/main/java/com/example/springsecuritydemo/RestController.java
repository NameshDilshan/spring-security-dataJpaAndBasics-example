package com.example.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String home(){
        return ("<h1>Hi You are in Home</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1>Hi You are in User</h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Hi You are in Admin</h1>");
    }
}
