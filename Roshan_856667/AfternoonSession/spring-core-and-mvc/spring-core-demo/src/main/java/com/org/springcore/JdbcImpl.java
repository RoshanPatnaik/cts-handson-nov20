package com.org.springcore;

public class JdbcImpl implements EmployeeDao {
	
	private DBConfig dbConfig;

	public void setDbConfig(DBConfig dbConfig) {
		this.dbConfig = dbConfig;
	}

	@Override
	public void store() {
		System.out.println("store() implementation done via jdbc");
		System.out.println("DB Config Url = "+dbConfig.getDbUrl()+", Name = "+dbConfig.getDbname());
	}

}
