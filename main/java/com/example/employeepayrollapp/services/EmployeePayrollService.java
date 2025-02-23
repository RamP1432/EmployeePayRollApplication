package com.example.employeepayrollapp.services;

import com.example.employeepayrollapp.dto.EmployeePayrollDTO;
import com.example.employeepayrollapp.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeePayrollService {
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(int id);
    Employee createEmployee(EmployeePayrollDTO employeeDTO);
    Employee updateEmployee(int id, EmployeePayrollDTO employeeDTO);
    void deleteEmployee(int id);
}

