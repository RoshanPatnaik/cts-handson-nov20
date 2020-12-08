package com.org;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
	
		Employee e1 = new Employee(1,"e1");
		Employee e2 = new Employee(2,"e2");
		Employee e3 = new Employee(3,"e3");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		service.setList(list);
		service.getAllEmployees();
	
	}
	
}
