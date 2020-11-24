package com.org.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDao dao = (EmployeeDao)context.getBean("dao");
		EmployeeService service = (EmployeeService)context.getBean("service");
		service.storeEmployee();
		dao.store();

	}

}
