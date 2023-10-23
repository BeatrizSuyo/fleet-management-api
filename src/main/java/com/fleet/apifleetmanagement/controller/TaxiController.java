package com.fleet.apifleetmanagement.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet.apifleetmanagement.model.Taxi;
import com.fleet.apifleetmanagement.services.TaxiService;

@Configuration
@RestController
@RequestMapping("taxiApi")
public class TaxiController {

    private final TaxiService taxiService;


    //@Autowired
    public TaxiController(TaxiService taxiService) {
        this.taxiService = taxiService;

    }

    @GetMapping("/taxi/{id}")
        public Taxi getTaxiById(@PathVariable int id) {
            return taxiService.getTaxiById(id);
        }

    @GetMapping("/placa/{placa}")
        public Taxi getTaxiByPlaca(@PathVariable String placa){return taxiService.getTaxiByPlaca(placa);}

}
