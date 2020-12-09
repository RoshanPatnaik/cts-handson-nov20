package com.org.paytmservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paytm")
public class PaytmController {
	
	@GetMapping
	public String displayHello() {
		return "Hello";
	}
	
}
