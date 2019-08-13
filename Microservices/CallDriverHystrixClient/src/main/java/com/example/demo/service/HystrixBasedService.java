package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Repository
public class HystrixBasedService {

	@Autowired
	private RestTemplate template;
	
	@HystrixCommand(fallbackMethod = "myCallBack")
	public String findDriver() {
		return template.getForObject("http://call-driver-provider/drivers", String.class);
	}
	
	public String myCallBack() {
		return "Takes more time to response - Please Go and Never come back";
	}
}
