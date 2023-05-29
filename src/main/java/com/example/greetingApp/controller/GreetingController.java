package com.example.greetingApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/hello")
    public String message(@RequestParam String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " welcome to BridgeLabz";
    }
}
