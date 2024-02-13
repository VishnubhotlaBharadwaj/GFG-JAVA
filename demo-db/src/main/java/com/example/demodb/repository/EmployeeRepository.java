package com.example.demodb.repository;

import com.example.demodb.models.Employee;
import lombok.Value;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository {

    public Connection connection;

    EmployeeRepository(@Value("${db_url}") String url,
                       @Value("${db_username}") String username,
                       @Value("${db_password}") String password) {


    }

    public void connectToDB() {
        this.connection = DriverManager.getConnection();
    }




    private HashMap<String, Employee> employeeHashMap = new HashMap<>();
    public Employee create(Employee employee) {
        employeeHashMap.put(employee.getId(), employee);
        return employee;
    }

    public Employee get(String id) {
        return employeeHashMap.get(id);
    }

    public List<Employee> get() {
        return employeeHashMap.values().
                stream().
                collect(Collectors.toList());
    }

    public Employee update(Employee employee) {
        Employee existingEmployee = employeeHashMap.get(employee.getId());
        if(existingEmployee != null) {
            //Here we need to merge existing as well as the old data.
            employee = merge(existingEmployee, employee);
            employeeHashMap.put(employee.getId(), employee);
        }
        return employee;
    }

    private Employee merge(Employee oldData, Employee newData) {
        newData.setCreateOn(oldData.getCreateOn());
        return newData;
    }

    public Employee delete(String employeeId) {
        return employeeHashMap.remove(employeeId);
    }
}
