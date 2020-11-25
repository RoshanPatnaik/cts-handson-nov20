package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public void store(Employee employee) {
		String query = "insert into employee values (?,?,?)";
		jdbc.update(query,employee.getId(),employee.getName(),employee.getSalary());

	}

}
