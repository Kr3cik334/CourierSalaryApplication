package com.couriersalaryapplication.couriersalary.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "USERS")

public class User {

    @Id
    @GeneratedValue
    private Long userId;
    private String login;
    private String password;
}
