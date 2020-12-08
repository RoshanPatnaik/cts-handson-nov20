package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<Employee> fetchAllEmployees() {
		
		return jdbcTemplate.query("select * from employee", (rs,num) -> new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary")));
	}


	@Override
	public void addEmployee(Employee employee) {
		String query = "insert into employee values (?,?,?)";
	    jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getSalary());

		
	}

}
