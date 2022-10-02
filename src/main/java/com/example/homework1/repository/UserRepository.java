package com.example.homework1.repository;

import com.example.homework1.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getPersonsByCity(String city) {
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.city = :city");
        query.setParameter("city", city);
        return query.getResultList();
    }
}
