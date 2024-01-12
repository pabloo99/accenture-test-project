package com.sda.rest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/regions")
@AllArgsConstructor
public class RegionController {
    private final RegionService regionService;

    @GetMapping("/{id}")
    public Region getRegionById(@PathVariable Integer id){
        return regionService.getRegionById(id);
    }

    @GetMapping
    public List<Region> getAllRegions(){
        return regionService.getAllRegions();
    }

    @PutMapping("/{id}")
    public void updateRegion(@PathVariable Integer id, @RequestBody Region region){
        Region existingRegion = regionService.getRegionById(id);
        if (existingRegion != null){
            existingRegion.setRegionId(id);
            regionService.updateRegion(region);
        }
    }

    @PostMapping
    public void addRegion(@RequestBody Region region){
        regionService.saveRegion(region);
    }

    @DeleteMapping("/{id}")
    public void deleteRegion(@PathVariable Integer id){
        regionService.deleteRegion(id);
    }
}
