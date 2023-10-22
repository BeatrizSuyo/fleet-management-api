package com.fleet.apifleetmanagement.services;

import org.springframework.stereotype.Service;

import com.fleet.apifleetmanagement.repository.TrajectoriesRepository;
@Service
public class TrajectoriesService {
    private final TrajectoriesRepository trajectoriesRepository;

    public TrajectoriesService(TrajectoriesRepository trajectoriesRepository) {
        this.trajectoriesRepository = trajectoriesRepository;
    }

    public TrajectoriesRepository findLastLocationByTaxiId(int taxiId) {
        return trajectoriesRepository.findLastLocationByTaxiId(taxiId);
    }
}
