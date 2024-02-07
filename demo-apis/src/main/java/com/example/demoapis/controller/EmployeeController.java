package com.example.demoapis.controller;

import com.example.demoapis.dto.CreateEmployeeRequest;
import com.example.demoapis.models.Employee;
import com.example.demoapis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

   @Autowired
   EmployeeService employeeService;

    @PostMapping(" ")
    public Employee createEmployee(@RequestBody CreateEmployeeRequest request) {
        return employeeService.create(request);
    }
}
