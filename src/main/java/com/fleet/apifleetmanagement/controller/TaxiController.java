package com.fleet.apifleetmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet.apifleetmanagement.model.Taxi;
import com.fleet.apifleetmanagement.services.TaxiService;


@RestController
@RequestMapping("taxiApi")
public class TaxiController {

@Autowired
private  TaxiService taxiService;


@GetMapping("/taxi/{id}")
public Taxi getTaxiById(@PathVariable int id) {
return taxiService.getTaxiById(id);
}

@GetMapping("/license/{license}")
public Taxi getTaxiByLicense(@PathVariable String license){return taxiService.getTaxiByLicense(license);}

}
