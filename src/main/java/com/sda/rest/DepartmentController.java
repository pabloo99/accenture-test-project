package com.sda.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }


    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id) {
        return departmentService.getDepartmentById(id);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping
    public void addDepartment(@RequestBody Department department) {
        departmentService.saveDepartment(department);
    }

    @PutMapping("/{id}")
    public void updateDepartment(@PathVariable Long id, @RequestBody Department department) {
        Department existingDepartment = departmentService.getDepartmentById(id);
        if (existingDepartment != null) {
            existingDepartment.setDepartmentId(id);
            departmentService.updateDepartment(department);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
    }
}
