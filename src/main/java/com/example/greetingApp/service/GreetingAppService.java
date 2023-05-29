package com.example.greetingApp.service;

import com.example.greetingApp.dto.GreetingAppDto;
import com.example.greetingApp.model.GreetingApp;
import com.example.greetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingAppService {
    @Autowired
    private GreetingRepository greetingRepo;


    public GreetingApp addUser(GreetingAppDto user) {
        GreetingApp greetingApp = new GreetingApp(user);
        return greetingRepo.save(greetingApp);

    }
}
