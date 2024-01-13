package com.sda.rest;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "departments")
@Data
public class Department {

    @Id
    private long departmentId;

    private String departmentName;
    private Integer managerId;
    //private Integer locationId;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
}
