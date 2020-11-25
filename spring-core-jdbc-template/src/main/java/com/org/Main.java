package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = new Employee(100,"Nikitha",200000);
		EmployeeService service = (EmployeeService)context.getBean("employeeServiceImpl");
		service.storeEmployee(employee);
	}

}
