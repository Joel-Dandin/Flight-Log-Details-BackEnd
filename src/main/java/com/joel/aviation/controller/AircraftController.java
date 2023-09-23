package com.joel.aviation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.joel.aviation.model.Aircraft;
import com.joel.aviation.service.AircraftService;

@RestController
@CrossOrigin(origins = "*")
public class AircraftController {
	private final AircraftService aircraftService;
	@Autowired
    public AircraftController(AircraftService aircraftService) {
        this.aircraftService = aircraftService;
    }
//	http://localhost:8080/FlightLog/add
	/*
	  {
	  "id":"5",
	  "aircraft_id":"1",
	  "departure":"Here",
	  "destination":"There",
	 "log_date":"data"
	  }
	 */
	@PostMapping("/Aircraft/add")
	public boolean newAircraft(@RequestBody Aircraft newAircraft) {
		System.out.println("Adding " + newAircraft.toString());
		return aircraftService.addAircraft(newAircraft);
	}
//	http://localhost:8080/Aircraft/allaircraft
	@GetMapping(value = "/Aircraft/allaircraft")
	public List<Aircraft> allaircraft() {

		return aircraftService.showAllAircrafts();
	}
//	http://localhost:8080/Aircraft/aircraftdetail/1
	@GetMapping(value = "/Aircraft/aircraftdetail/{aircraft_id}")
	public Aircraft aircraftdetail(@PathVariable("aircraft_id") long aircraft_id ) {

		return aircraftService.showAircrafts(aircraft_id);
	}
}
