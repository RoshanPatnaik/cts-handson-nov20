package com.org;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Employee employee = new Employee(305,"John",3500000);
		EmployeeService service = (EmployeeService)context.getBean("employeeServiceImpl");
		//service.storeEmployee(employee);
		
		
		List<Employee> list = service.fetchAllEmployees();
		list.forEach(emp -> System.out.println(emp.getId()));
	}

}
