package com.org;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class AspectDemo {
	
	@After("execution(public * com.org.EmployeeService.get*(..))")
	public void log() {
		System.out.println("----- log() is called -----");
	}
}
