package com.example.employeepayrollapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee_payroll")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double salary;
}

