package com.sda.rest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "regions")
@Data
public class Region {
    @Id
    private Integer regionId;
    private String regionName;
}
