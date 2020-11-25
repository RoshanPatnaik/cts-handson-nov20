package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;
	
	public void storeEmployee() {
		System.out.println("storeEmployee() method of EmployeeService");
		empDao.store();

	}

}
