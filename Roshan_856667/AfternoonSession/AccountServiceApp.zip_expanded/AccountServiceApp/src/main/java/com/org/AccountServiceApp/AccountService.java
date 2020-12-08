package com.org.AccountServiceApp;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
	public Account fetchAccountById(long accNum) {
		Account acc = new Account();
		acc.setAccountNumber(accNum);
		acc.setAmount(new Double(Math.random() * accNum).intValue());
		return acc;
	}
}
