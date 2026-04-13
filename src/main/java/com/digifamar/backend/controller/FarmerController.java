package com.digifamar.backend.controller;

import com.digifamar.backend.model.Farmer;
import com.digifamar.backend.repository.FarmerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farmers")
public class FarmerController {

    private final FarmerRepository farmerRepository;

    public FarmerController(FarmerRepository farmerRepository) {
        this.farmerRepository = farmerRepository;
    }

    // GET all farmers
    @GetMapping
    public List<Farmer> getAllFarmers() {
        return farmerRepository.findAll();
    }

    // POST create farmer
    @PostMapping
    public Farmer createFarmer(@RequestBody Farmer farmer) {
        return farmerRepository.save(farmer);
    }
}
