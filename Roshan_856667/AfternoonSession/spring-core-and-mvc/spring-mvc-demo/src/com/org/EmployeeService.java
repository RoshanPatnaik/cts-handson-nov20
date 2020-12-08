package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> fetchAllEmployees(){
		employeeDao.fetchAllEmployees().forEach(e -> System.out.println(e));
		return employeeDao.fetchAllEmployees();
	}
	
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);		
	}
	
}
