package com.silstechnologie.cassandra_bdcc.web;

import com.silstechnologie.cassandra_bdcc.entities.User;
import com.silstechnologie.cassandra_bdcc.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService service;


    public UserController(UserService userService) {
        this.service = userService;
    }

    @GetMapping
    public List<User> getUsers(){
        return service.getAllUsers();
    }

    @PostMapping
    public String saveUser(@RequestParam String name, @RequestParam int age, @RequestParam String email){
        service.addUser(name, age, email);
        return "User is saved";
    }
}
