package com.example.employeepayrollapp.controllers;

import com.example.employeepayrollapp.dto.EmployeePayrollDTO;
import com.example.employeepayrollapp.model.Employee;
import com.example.employeepayrollapp.services.EmployeePayrollService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService employeeService;

    @GetMapping("/")
    public String getWelcomeMessage() {
        return "Welcome to Employee Payroll Service!";
    }

    @GetMapping("/get")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/create")
    public Employee createEmployee(@Valid @RequestBody EmployeePayrollDTO employeeDTO) {
        return employeeService.createEmployee(employeeDTO);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id, @Valid @RequestBody EmployeePayrollDTO employeeDTO) {
        return employeeService.updateEmployee(id, employeeDTO);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return "Deleted Employee with ID: " + id;
    }
}
