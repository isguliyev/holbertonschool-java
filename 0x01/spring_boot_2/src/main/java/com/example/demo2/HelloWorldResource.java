package com.example.demo2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/messages")
public class HelloWorldResource {
    @GetMapping(path = "home")
    public String home() {
        return "MAVEN PROJECT (SPRING INITIALIZR) SUCCESSFULLY CREATED!!!";
    }
}