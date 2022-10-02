package com.example.homework1.controller;

import com.example.homework1.entity.User;
import com.example.homework1.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final UserRepository repository;

    public Controller(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<User> getPersonsByCity(@RequestParam String city) {
        return repository.getPersonsByCity(city);
    }
}
