package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public List<Employee> fetchAllEmployees(){
		return dao.fetchAllEmployees();
	}
	
}
