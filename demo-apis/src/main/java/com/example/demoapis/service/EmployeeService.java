package com.example.demoapis.service;

import com.example.demoapis.repository.EmployeeRepository;
import com.example.demoapis.dto.CreateEmployeeRequest;
import com.example.demoapis.models.Employee;

public class EmployeeService {

    EmployeeRepository employeeRepository;
    public Employee create(CreateEmployeeRequest createEmployeeRequest) {
        Employee employee = createEmployeeRequest.to();
        return employeeRepository.create(employee);
    }

    public Employee get(String id) {
        return employeeRepository.get(id);
    }
}
