package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.entity.Employee;
import com.cognizant.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return service.getAllEmployees();
    }

}