package com.examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeService {
	
	private static List<Employee> employees;
	
	public void addEmployee(Employee e){
		employees.add(e);
	}

	public Employee findEmployeeById(int id) {
		for(Employee e : employees) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}
	
	public List<Employee> getEmployees(){
		return employees;
	}
	
	public List<Employee> getSortedEmployeesById(){
		Collections.sort(employees,(e1,e2) -> e1.getId() - e2.getId());
		return employees;
	}
	
	
}
