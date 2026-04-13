package com.digifamar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class FarmerController {

    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "DiGiFaMaR backend running");
        return response;
    }

    @PostMapping("/farmers")
    public ResponseEntity<Map<String, Object>> addFarmer(@RequestBody Map<String, Object> data) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Farmer received");
        response.put("data", data);
        return ResponseEntity.ok(response);
    }
}
