package com.couriersalaryapplication.couriersalary.service;

import com.couriersalaryapplication.couriersalary.entity.User;
import com.couriersalaryapplication.couriersalary.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User getUserByLogin(String login) {
        return repository.findByLogin(login);
    }
}
