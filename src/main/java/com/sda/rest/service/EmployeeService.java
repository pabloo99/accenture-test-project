package com.sda.rest.service;

import com.sda.rest.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeById(Long id);
    void saveEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(Long id);
    List<Employee> getAllEmployees();
}
