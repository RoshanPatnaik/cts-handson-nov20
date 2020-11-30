package com.org;

public class AccountNotFoundException extends Exception {
	
	public void printMessage() {
		System.out.println("Account not found with the given account number");
	}
	
}
