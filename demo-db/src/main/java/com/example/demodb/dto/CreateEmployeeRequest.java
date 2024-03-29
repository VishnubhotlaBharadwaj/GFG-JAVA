package com.example.demodb.dto;

import com.example.demodb.models.Address;
import com.example.demodb.models.Department;
import com.example.demodb.models.Employee;

import java.util.UUID;

public class CreateEmployeeRequest {
    private String name;
    private int age;
    private Department department;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // conversion from Dto (Data transfer objects) -> Model
    public Employee to() {
        Employee employee = new Employee();
        employee.setName(this.name);
        employee.setAge(this.age);
        employee.setAddress(this.address);
        employee.setDepartment(this.department);
        employee.setCreateOn(System.currentTimeMillis());
        employee.setUpdatedOn(System.currentTimeMillis());
        employee.setId(UUID.randomUUID().toString());

        return employee;
    }
}
