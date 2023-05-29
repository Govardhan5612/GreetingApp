package com.example.greetingApp.controller;

import com.example.greetingApp.dto.GreetingAppDto;
import com.example.greetingApp.model.GreetingApp;
import com.example.greetingApp.repository.GreetingRepository;
import com.example.greetingApp.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GreetingController {
    @GetMapping("/hello")
    public String message(@RequestParam String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " welcome to BridgeLabz";
    }

    @Autowired
    GreetingAppService greetingService;

    @PostMapping("/add")
    public GreetingApp addUser(@RequestBody GreetingAppDto user) {
        return greetingService.addUser(user);
    }

    @GetMapping("/get/{id}")
    public Optional<GreetingApp> getUser(@PathVariable int id) {
        return greetingService.getUserById(id);
    }

    @GetMapping("/get")
    public List<GreetingApp> getUsers() {
        return greetingService.getUsers();
    }

    @PutMapping("/update/{id}")
    public GreetingApp UpdateUser(@PathVariable int id, @RequestBody GreetingAppDto user) {
        return greetingService.UpdateUser(id, user);

    }
}

