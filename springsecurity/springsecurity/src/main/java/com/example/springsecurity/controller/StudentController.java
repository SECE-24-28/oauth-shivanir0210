package com.example.springsecurity.controller;

import com.example.springsecurity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//see when i add spring security it shows the login page and the user name and pass want to put
//for get no need of csrd only for put and post needed
@RestController
public class StudentController {


    List<Student> list=new ArrayList<>(
            Arrays.asList(
                    new Student(1,"shivani","css"),
           new Student(2,"shiva","css"),
             new Student(3,"shivuhh","html")));

    @GetMapping("/get")
    public List<Student> getstudents() {
         return list;
    }

    @PostMapping("post")
    public String addstudent(@RequestBody Student student)
    {
      list.add(student);
      return "sucess";
    }
    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

}
