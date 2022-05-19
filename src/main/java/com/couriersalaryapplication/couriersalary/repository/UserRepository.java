package com.couriersalaryapplication.couriersalary.repository;

import com.couriersalaryapplication.couriersalary.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByLogin(String login);
}
