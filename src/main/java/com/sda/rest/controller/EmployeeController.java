package com.sda.rest.controller;

import com.sda.rest.service.EmployeeService;
import com.sda.rest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        Employee existingEmployee = employeeService.getEmployeeById(id);
        if (existingEmployee != null) {
            existingEmployee.setEmployeeId(id);
            employeeService.updateEmployee(employee);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
