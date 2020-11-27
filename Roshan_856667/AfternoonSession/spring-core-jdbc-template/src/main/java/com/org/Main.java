package com.org;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = new Employee(300,"Arya",350000);
		EmployeeService service = (EmployeeService)context.getBean("employeeServiceImpl");
		service.storeEmployee(employee);
//		Employee e = service.fetchEmployeeById(300);
//		System.out.println(e);
//		
//		List<Employee> list = service.fetchAllEmployees();
//		list.forEach(emp -> System.out.println(emp));
	}

}
