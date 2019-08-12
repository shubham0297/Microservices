package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CabDriverController {

	@GetMapping("/drivers")
	public String getDriver() {
		return "Shubham - 9786543210";
	}
	
}
