package com.sda.rest;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "departments")
@Data
public class Department {

    @Id
    private Long departmentId;

    private String departmentName;
    private Integer managerId;
    private Integer locationId;
}
