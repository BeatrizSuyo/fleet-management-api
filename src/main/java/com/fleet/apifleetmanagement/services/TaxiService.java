package com.fleet.apifleetmanagement.services;

import com.fleet.apifleetmanagement.model.Taxi;
import com.fleet.apifleetmanagement.repository.TaxiRepository;

public class TaxiService {
     private final TaxiRepository taxiRepository;

    public TaxiService(TaxiRepository taxiRepository) {
        this.taxiRepository = taxiRepository;
    }


    public Taxi getTaxiById(int id) {

        return taxiRepository.findById(id);
    }

    public Taxi getTaxiByPlaca(String placa){
        return taxiRepository.findByPlaca(placa);
    }
}