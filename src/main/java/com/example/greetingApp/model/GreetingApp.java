package com.example.greetingApp.model;

import com.example.greetingApp.dto.GreetingAppDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GreetingApp")
public class GreetingApp {
    @Id
    @GeneratedValue()
    private int id;
    private String message;


    public GreetingApp() {
    }

    public GreetingApp(GreetingAppDto greetingAppDto) {
        message=greetingAppDto.message;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
