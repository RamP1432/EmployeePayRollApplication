package com.example.employeepayrollapp.repository;

import com.example.employeepayrollapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeePayrollRepository extends JpaRepository<Employee, Integer> {
}

