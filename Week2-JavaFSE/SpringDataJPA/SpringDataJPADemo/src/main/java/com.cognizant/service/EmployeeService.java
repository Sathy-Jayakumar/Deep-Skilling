package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entity.Employee;
import com.cognizant.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

}