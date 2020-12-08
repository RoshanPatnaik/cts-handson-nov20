package com.org.walletservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wallet")
public class WalletRest {

	@Autowired
	private WalletService service;
	
	@GetMapping("{accNum}")
	public Wallet addAmountToWallet(@PathVariable long accNum) {
		return service.addAmountToWallet(accNum);
	}
	
}
