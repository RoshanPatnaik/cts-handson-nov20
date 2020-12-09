package com.org.microservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Microservice1service {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String method1() {
		String response = null;
		response = restTemplate.getForObject("http://MICROSERVICE2/m2",String.class);
		return response;
	}
	
}
