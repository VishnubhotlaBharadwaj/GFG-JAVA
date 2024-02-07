package com.example.demoapis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

   @Autowired
   EmployeeService employeeService;

    @PostMapping(" ")
    public void createEmployee(@RequestBody CreateEmployeeRequest request) {

    }
}
