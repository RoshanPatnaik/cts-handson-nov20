package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JpaImpl implements EmployeeDao {

	@Autowired
	private DBConfig dbConfig;
	
	public void store() {
		System.out.println("Store() method of EmployeeDao");

	}

}
