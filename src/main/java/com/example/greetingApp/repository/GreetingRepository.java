package com.example.greetingApp.repository;

import com.example.greetingApp.model.GreetingApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<GreetingApp,Integer> {
}
