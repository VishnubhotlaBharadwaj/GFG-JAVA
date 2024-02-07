package com.example.demoapis.repository;

import com.example.demoapis.models.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeRepository {

    private HashMap<String, Employee> employeeHashMap = new HashMap<>();
    public Employee create(Employee employee) {
        return employeeHashMap.put(employee.getId(), employee);
    }

    public Employee get(String id) {
        return employeeHashMap.get(id);
    }

    public List<Employee> get() {
        return employeeHashMap.values().
                stream().
                collect(Collectors.toList());
    }
}
