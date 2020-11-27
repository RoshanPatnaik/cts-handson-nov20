package com.org;

import java.util.List;

import org.springframework.stereotype.Repository;

public interface EmployeeDao {
	public void store(Employee employee);
	public Employee findEmployeeById(int id);
	public List<Employee> findEmployees();
}
