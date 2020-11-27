package com.org;

import java.util.List;

import org.springframework.stereotype.Service;

public interface EmployeeService {
	public void storeEmployee(Employee employee);
	public Employee fetchEmployeeById(int id);
	public List<Employee> fetchAllEmployees();
}
