package com.org.walletservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WalletService {
	
	@Autowired
	private RestTemplate rest;
	
	public Wallet addAmountToWallet(long accNum) {
		Wallet wallet = new Wallet();
		AccountStructure acc = rest.getForObject("http://EMPLOYEE-SERVICE/account"+accNum, AccountStructure.class);
		wallet.setBalance(wallet.getBalance()+(acc.getAmount() * 0.5));
		return wallet;
	}
	
}
