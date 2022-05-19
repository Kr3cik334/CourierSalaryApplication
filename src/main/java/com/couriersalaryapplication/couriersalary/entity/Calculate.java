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
@Table(name = "CALCULATE")
public class Calculate {

    @Id
    @GeneratedValue
    private Long calculateId;
    private Double salary;
    private Double fuleCost;
    private Long days;
    private Double income;
    private Double dailyIncome;

    public Double getIncome() {
        income = salary - fuleCost;
        return income;
    }

    public Double getDailyIncome() {
        dailyIncome = income / days;
        return dailyIncome;
    }

}

