package com.sda.rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "locations")
@Data
public class Location {

    @Id
    private Long locationId;

    private String city;
}
