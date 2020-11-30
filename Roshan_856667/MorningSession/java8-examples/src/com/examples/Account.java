package com.examples;

public class Account {
	private int accNO;
	private String name;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accNO, String name) {
		super();
		this.accNO = accNO;
		this.name = name;
	}
	public int getAccNO() {
		return accNO;
	}
	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [accNO=" + accNO + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + accNO;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());A
		return this.accNO;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accNO != other.accNO)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
