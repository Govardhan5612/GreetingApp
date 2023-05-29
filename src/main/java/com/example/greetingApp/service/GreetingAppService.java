package com.example.greetingApp.service;

import com.example.greetingApp.dto.GreetingAppDto;
import com.example.greetingApp.model.GreetingApp;
import com.example.greetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingAppService {
    @Autowired
    private GreetingRepository greetingRepo;


    public GreetingApp addUser(GreetingAppDto user) {
        GreetingApp greetingApp = new GreetingApp(user);
        return greetingRepo.save(greetingApp);

    }

    public Optional<GreetingApp> getUserById(int id) {
        return greetingRepo.findById(id);
    }

    public List<GreetingApp> getUsers() {
        return greetingRepo.findAll();
    }

    public GreetingApp UpdateUser(int id, GreetingAppDto user) {
        Optional<GreetingApp> userData = greetingRepo.findById(id);
        if (userData.isPresent()) {

            userData.get().setFirstName(user.firstName);
            userData.get().setLastName(user.lastName);
            return greetingRepo.save(userData.get());
        }
        return null;
    }
    public void deleteUser( int id){
        Optional<GreetingApp> userData = greetingRepo.findById(id);
        if (userData.isPresent()) {
            greetingRepo.deleteById(id);
        }
    }
}
