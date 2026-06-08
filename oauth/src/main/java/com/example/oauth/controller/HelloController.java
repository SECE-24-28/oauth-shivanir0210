package com.example.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/public")
    public String test() {
        return "Public Endpoint";
    }

    @GetMapping("loginn")
    public String login(){
        return "logged in";
    }

    @GetMapping("privatee")
    private String logg(){
        return "authorized";
    }
}
