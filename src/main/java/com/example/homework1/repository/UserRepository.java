package com.example.homework1.repository;

import com.example.homework1.entity.Contact;
import com.example.homework1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Contact> {

    @Query("select u from User u where u.city = :city")
    List<User> fromCity(@Param("city") String city);

    @Query("select u from User u where u.contact.age = :age")
    List<User> thatAge(@Param("age") int age);

    @Query("select u from User u where u.contact.name = :name and u.contact.surname = :surname")
    List<User> nameAndSurname(@Param("name") String name, @Param("surname") String surname);
}
