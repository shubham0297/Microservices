package com.example.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripDetailsController {

	
	// For the sake of time saving....not creating Service or repository .... In real projects, we need to create service or repository and not hard code in controller
	@GetMapping("/getTrips")
	public String getTrip() {
		return "ch40-to-ch-50,ch60-to-ch70";
	}
	
	@GetMapping("/upcomingTrips")
	public String upcomingTrips() {
		return "ch-117 to ch-40";
	}
}
