package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodOrderController {
	
	// For the sake of time saving....not creating Service or repository .... In real projects, we need to create service or repository and not hard code in controller
	@GetMapping("/getPastOrders")
	public String getTrip() {
		return "springRolls,kabab,pasta";
	}
	
	@GetMapping("/upcomingOrders")
	public String upcomingTrips() {
		return "biryani,sandwich,burger,pizza";
	}
	

}
