package com.org.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.Customer;
import com.org.dao.CustomerRepository;
import com.org.exception.CustomerNotFoundException;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository dao;
	
	public void addCustomer(Customer customer) {
		dao.save(customer);
	}
	
	public List<Customer> fetchCustomers(){
		return dao.findAll();
	}
	
	public void deleteCustomerById(int id){
		Optional<Customer> option = dao.findById(id);
		if(option.isPresent()) {
			dao.delete(option.get());
		}
		
	}
	
	public Customer getCustomerById(int id) throws CustomerNotFoundException {
		Optional<Customer> option = dao.findById(id);
		if(option.isPresent()) {
			return option.get();
		}
		else {
			throw new CustomerNotFoundException("Sorry customer with the ID - "+id+" is not found");
		}
	}
	
}
