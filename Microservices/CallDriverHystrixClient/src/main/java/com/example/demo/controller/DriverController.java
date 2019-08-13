package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HystrixBasedService;

@RestController
public class DriverController {

	@Autowired
	private HystrixBasedService service;
	
	@GetMapping("/drivers")
	public String getFriver() {
		return this.service.findDriver();
	}
	
}
