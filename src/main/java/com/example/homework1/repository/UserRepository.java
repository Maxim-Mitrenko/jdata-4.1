package com.example.homework1.repository;

import com.example.homework1.entity.Contact;
import com.example.homework1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Contact> {

    List<User> findByCity(String city);

    List<User> findByContactAge(int age);

    List<User> findByContactNameAndContactSurname(String name, String surname);
}
