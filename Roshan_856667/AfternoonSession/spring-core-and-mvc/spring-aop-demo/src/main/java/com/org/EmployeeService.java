package com.org;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	private List<Employee> list;
	
	public Employee getEmployeeById(int id) {
		return list.stream().filter(employee -> employee.getId() == id).collect(Collectors.toList()).get(0);
	}
	
	public Employee getEmployeeByIdAndName(int id, String name) {
		return list.stream().filter(employee -> employee.getId() == id && employee.getName().equals(name)).collect(Collectors.toList()).get(0);
	}
	
	public String getEmployeeName(int id) {
		return list.stream().filter(employee -> employee.getId() == id).collect(Collectors.toList()).get(0).getName();
	}
	
	public List<Employee> getAllEmployees(){
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
	
	
	
}
