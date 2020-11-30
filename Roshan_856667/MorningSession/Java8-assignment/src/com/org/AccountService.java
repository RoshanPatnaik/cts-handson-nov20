package com.org;

public class AccountService {
	private AccountDao accountDao = new AccountDaoImpl();
	
	public void addAccount(Account account) throws AccountAlreadyException {
		accountDao.addAccount(account);
	}
	
	public void removeAccount(int accNo) throws AccountNotFoundException {
		accountDao.removeAccount(accNo);
		
	}
	
	public void displayAccount(int accNo) throws AccountNotFoundException {
		accountDao.displayAccount(accNo);
		
	}
	
	public void displayAccountsWithAmountLessthan1000() {
		accountDao.displayAccountsWithAmountLessThan1000();
	}
	
}
