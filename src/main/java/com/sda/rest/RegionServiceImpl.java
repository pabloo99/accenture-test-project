package com.sda.rest;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RegionServiceImpl implements RegionService{
    private final RegionRepository repository;

    @Override
    public Region getRegionById(Integer id) {
        Optional<Region> result = repository.findById(id);
        return result.orElse(null);
    }

    @Override
    public void saveRegion(Region region) {
        repository.save(region);
    }

    @Override
    public void updateRegion(Region region) {
        repository.save(region);
    }

    @Override
    public void deleteRegion(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Region> getAllRegions() {
        return repository.findAll();
    }
}
