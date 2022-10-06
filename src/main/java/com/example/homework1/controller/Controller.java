package com.example.homework1.controller;

import com.example.homework1.entity.User;
import com.example.homework1.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class Controller {

    private final UserRepository repository;

    public Controller(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    public List<User> all() {
        return repository.findAll();
    }
    @GetMapping("/by-city")
    public List<User> findByCity(@RequestParam String city) {
        return repository.findByCity(city);
    }

    @GetMapping("/by-age")
    public List<User> findByAge(@RequestParam int age) {
        return repository.findByContactAge(age);
    }

    @GetMapping("/by-nameAndSurname")
    public List<User> findByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return repository.findByContactNameAndContactSurname(name, surname);
    }
}
