package com.couriersalaryapplication.couriersalary.entity;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Calculate {

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

