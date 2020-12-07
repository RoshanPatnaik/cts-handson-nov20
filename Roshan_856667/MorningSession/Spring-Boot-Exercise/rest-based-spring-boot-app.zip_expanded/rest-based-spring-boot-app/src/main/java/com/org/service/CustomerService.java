package com.org.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.Customer;
import com.org.dao.CustomerRepository;

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
	
	public void deleteCustomerById(int id) {
		Optional<Customer> option = dao.findById(id);
		if(option.isPresent()) {
			dao.delete(option.get());
		}
	}
	
}
