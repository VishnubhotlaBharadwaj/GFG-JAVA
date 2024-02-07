package com.example.demoapis.repository;

import com.example.demoapis.models.Employee;

import java.util.HashMap;

public class EmployeeRepository {

    private HashMap<String, Employee> employeeHashMap = new HashMap<>();
    public Employee create(Employee employee) {
        return employeeHashMap.put(employee.getId(), employee);
    }
}
