package com.org.app1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("app4")
public class App4Controller {
	
	
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping
	public String greetings() {
		LOG.info("::::: greetings in app4 :::::");
		
		return "Hello World!";
	}
	
	
}
