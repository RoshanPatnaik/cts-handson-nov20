package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDao empDao = (EmployeeDao)context.getBean("jpaImpl");
		empDao.store();
		

	}

}
