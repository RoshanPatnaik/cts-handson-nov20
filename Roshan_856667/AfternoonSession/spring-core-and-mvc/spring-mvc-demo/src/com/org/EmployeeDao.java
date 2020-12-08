package com.org;

import java.util.List;

import org.springframework.stereotype.Repository;

public interface EmployeeDao {
	public List<Employee> fetchAllEmployees();
	public void addEmployee(Employee e);
}
