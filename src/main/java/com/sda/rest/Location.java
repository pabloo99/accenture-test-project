package com.sda.rest;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "locations")
@Data
public class Location {
    @Id
    @Column(name = "location_id")
    private long locationId;

    private String streetAddress;
    private String postalCode;
    private String city;
    private String stateProvince;
    private String country_id;
}
