package com.fleet.apifleetmanagement.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet.apifleetmanagement.model.Trajectories;
import com.fleet.apifleetmanagement.services.TrajectoriesService;


@RestController
@RequestMapping("trajectoriesApi")
public class TrajectoriesController {
    private final TrajectoriesService trajectoriesService;

    public TrajectoriesController(TrajectoriesService trajectoriesService) {
        this.trajectoriesService = trajectoriesService;
    }

    @GetMapping("/trajectories/{taxiId}")
    public Trajectories findLastLocationByTaxiId(@PathVariable("taxiId") int taxiId) {
        return trajectoriesService.findLastLocationByTaxiId(taxiId);
    }
}