package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public void storeEmployee(Employee employee) {
		dao.store(employee);

	}
	
	public Employee fetchEmployeeById(int id) {
		return dao.findEmployeeById(id);
	}
	
	public List<Employee> fetchAllEmployees(){
		return dao.findEmployees();
	}

}
