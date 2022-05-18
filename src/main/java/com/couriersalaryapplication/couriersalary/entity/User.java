package com.couriersalaryapplication.couriersalary.entity;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class User {
    private Long userId;
    private String login;
    private String password;
}
