package com.example.greetingapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @GetMapping("/hello")
    public String getSimpleGreeting() {
        return "Hello, World!";
    }
}
