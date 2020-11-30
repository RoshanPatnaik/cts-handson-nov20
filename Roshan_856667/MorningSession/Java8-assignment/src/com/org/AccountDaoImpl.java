package com.org;

import java.util.ArrayList;
import java.util.List;


public class AccountDaoImpl implements AccountDao{

	private static List<Account> accounts = new ArrayList<Account>();
	
	@Override
	public void addAccount(Account account) throws AccountAlreadyException {
		for(Account acc : accounts) {
			if(acc.getAccNo() == account.getAccNo()) {
				throw new AccountAlreadyException();
			}
		}
		accounts.add(account);
		
	}

	@Override
	public void removeAccount(int accNo) throws AccountNotFoundException {
		int count = 0;
		for(Account account : accounts) {
			if(account.getAccNo() == accNo) {
				count = 1;
				accounts.remove(account);
				System.out.println(account);
			}
		}
		if(count == 0) {
			throw new AccountNotFoundException();
		}
		
	}

	@Override
	public void displayAccount(int accNo) throws AccountNotFoundException {
		int count = 0;
		for(Account account : accounts) {
			if(account.getAccNo() == accNo) {
				count++;
				System.out.println(account);
			}
		}
		if(count == 0) {
			throw new AccountNotFoundException();
		}
		
	}

	@Override
	public void displayAccountsWithAmountLessThan1000() {
		for(Account account : accounts) {
			if(account.getAmount() < 1000) {
				System.out.println(account);
			}
		}
		
	}
	
}
