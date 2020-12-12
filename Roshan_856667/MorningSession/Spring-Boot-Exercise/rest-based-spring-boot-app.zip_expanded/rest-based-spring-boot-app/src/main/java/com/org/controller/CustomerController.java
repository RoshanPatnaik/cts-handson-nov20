package com.org.controller;



import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.Customer;
import com.org.exception.CustomerNotFoundException;
import com.org.service.CustomerService;
import com.org.util.ResponseMessage;

@RequestMapping("customer")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> createCustomerAPI(@RequestBody Customer customer) {
		service.addCustomer(customer);
		return ResponseEntity.status(200).body(customer);
	}
	
	@GetMapping
	public ResponseEntity<Object> getAllCustomers(){
		return ResponseEntity.status(200).body(service.fetchCustomers());
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Object> deleteCustomerById(@PathVariable int id) {
		ResponseEntity<Object> response = null;
		try {
			Customer customer = service.getCustomerById(id);
			service.deleteCustomerById(id);
			response = ResponseEntity.status(200).body(customer);
		}catch(CustomerNotFoundException e){
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		}
		return response;
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Object> getCustomerById(@PathVariable int id) {
		ResponseEntity<Object> response = null;
		try {
			Customer customer = service.getCustomerById(id);
			response = ResponseEntity.status(200).body(customer);
		} catch (CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		}
		return response;
		
	}
	
	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principal) {
		return principal;
	}
	
}
