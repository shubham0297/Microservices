package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyClientController {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private LoadBalancerClient client;
	
	@GetMapping("/find/{location}")
	public String getHotels(@PathVariable("location") String loc) {
		ServiceInstance serviceInstance = client.choose("hotel-service");
//		
		String serviceId=serviceInstance.getServiceId().toString();
		System.out.println(serviceId);
		serviceId = "http://"+serviceId+"/find/"+loc;
		String response = template.getForObject(serviceId,String.class);
		return response ;
	}
	
	
}
