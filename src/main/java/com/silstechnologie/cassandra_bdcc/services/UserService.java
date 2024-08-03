package com.silstechnologie.cassandra_bdcc.services;

import com.silstechnologie.cassandra_bdcc.entities.User;
import com.silstechnologie.cassandra_bdcc.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private UserRepository repository;


    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void addUser(String name, int age, String email){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        user.setId(UUID.randomUUID());

        repository.insert(user);
    }

    public List<User> getAllUsers(){
        return repository.findAll();
    }


}
