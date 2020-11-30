package com.org;

public interface AccountDao {
	public void addAccount(Account account) throws AccountAlreadyException;
	public void removeAccount(int accNo) throws AccountNotFoundException;
	public void displayAccount(int accNo) throws AccountNotFoundException;
	public void displayAccountsWithAmountLessThan1000();
}
