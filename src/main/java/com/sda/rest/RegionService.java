package com.sda.rest;

import java.util.List;

public interface RegionService {
    Region getRegionById(Integer id);
    void saveRegion(Region region);
    void updateRegion(Region region);
    void deleteRegion(Integer id);
    List<Region> getAllRegions();
}
