package com.org.AccountServiceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountRest {

	@Autowired
	private AccountService service;
	
	@GetMapping("{accNum}")
	public Account fetchAccById(@PathVariable("accNum") long accNum) {
		return service.fetchAccountById(accNum);
	}
	
}
