package com.org;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
	
	public Employee findEmployeeById(int id) {
		Employee e = null;
		String query = "select * from employee where id = ?";
		e = jdbc.queryForObject(query,new Object[] {id}, new RowMapperImpl());
		return e;
	}
	
	public List<Employee> findEmployees(){
		return jdbc.query("select * from employee", (rs,num) -> new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary")));
	}

}
