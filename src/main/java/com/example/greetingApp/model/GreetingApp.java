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
    private String firstName, lastName;

    public String getFirstName() {
        return firstName;
    }

    public GreetingApp() {
    }

    public GreetingApp(GreetingAppDto greetingAppDto) {
        firstName = greetingAppDto.firstName;
        lastName = greetingAppDto.lastName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }
}
