package com.example.employeepayrollapp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePayrollDTO {

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @Min(value = 1000, message = "Salary must be at least 1000")
    private double salary;
}

