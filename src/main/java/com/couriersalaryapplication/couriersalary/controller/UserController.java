package com.couriersalaryapplication.couriersalary.controller;

import com.couriersalaryapplication.couriersalary.entity.User;
import com.couriersalaryapplication.couriersalary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return service.getUsers();
    }

    @GetMapping("/users/{login}")
    public User getUserByLogin(@PathVariable String login) {
        return service.getUserByLogin(login);
    }
}
