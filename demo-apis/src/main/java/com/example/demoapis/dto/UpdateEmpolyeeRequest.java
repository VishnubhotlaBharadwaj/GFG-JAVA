package com.example.demoapis.dto;

import com.example.demoapis.models.Address;
import com.example.demoapis.models.Department;
import com.example.demoapis.models.Employee;

public class UpdateEmpolyeeRequest {
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

    public Employee to(String employeeId) {
        Employee employee = new Employee();
        employee.setName(this.name);
        employee.setAge(this.age);
        employee.setAddress(this.address);
        employee.setDepartment(this.department);
        employee.setUpdatedOn(System.currentTimeMillis());
        employee.setId(employeeId);

        return employee;
    }
}
