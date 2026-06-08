package com.example.springsecurity.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String greet(HttpServletRequest request)
    {
        return "hi guys"+request.getSession().getId();
    }
    @GetMapping("/")
    public String hello(HttpServletRequest request)
    {
        return "hi this is shivani" + request.getSession().getId();
    }
}
