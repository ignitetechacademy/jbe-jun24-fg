package com.learn.spring.context.layers.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BankDIController {
	@Autowired
	BankDIService service;

	void createAccount(String accountHolderName, int inititlDeposit) {
		System.out.println("Create Account - controller");
		System.out.println(accountHolderName);
		System.out.println(inititlDeposit);

		service.createBankAccount(accountHolderName, inititlDeposit);
	}
}
