package com.example.demoapis;

public class EmployeeService {

    EmployeeRepository employeeRepository;
    public Employee create(CreateEmployeeRequest createEmployeeRequest) {
        Employee employee = createEmployeeRequest.to();
        return employeeRepository.create(employee);
    }
}
