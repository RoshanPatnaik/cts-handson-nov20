package com.org;

public class AccountAlreadyException extends Exception {
	
	
	public void printMessage() {
		System.out.println("Account already exists with that account number");
	}
	
}
