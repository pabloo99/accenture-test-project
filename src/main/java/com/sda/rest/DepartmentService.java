package com.sda.rest;
import java.util.List;
public interface DepartmentService {
    Department getDepartmentById(Long id);
    void saveDepartment(Department department);
    void updateDepartment(Department department);
    void deleteDepartment(Long id);
    List<Department> getAllDepartments();
}
