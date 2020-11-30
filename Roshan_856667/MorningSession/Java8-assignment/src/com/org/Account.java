package com.org;

public class Account {
	private int accNo;
	private String name;
	private double amount;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accNo, String name, double amount) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.amount = amount;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", amount=" + amount + "]";
	}
	
	
	
}
