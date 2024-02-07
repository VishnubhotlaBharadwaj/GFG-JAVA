package com.example.demoapis;

public class EmployeeService {

    EmployeeRepository employeeRepository;
    public void create(CreateEmployeeRequest createEmployeeRequest) {
        Employee employee = createEmployeeRequest.to();
    }
}
