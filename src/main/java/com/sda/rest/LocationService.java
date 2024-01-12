package com.sda.rest;

import java.util.List;

public interface LocationService {
    Location getLocationById(Long id);
    void saveLocation(Location location);
    void updateLocation(Location location);
    void deleteLocation(Long id);
    List<Location> getAllLocations();
}
