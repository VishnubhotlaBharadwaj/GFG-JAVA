package com.example.demoapis;

import java.util.HashMap;

public class EmployeeRepository {

    private HashMap<String, Employee> employeeHashMap = new HashMap<>();
    public Employee create(Employee employee) {
        return employeeHashMap.put(employee.getId(), employee);
    }
}
