package com.learn.spring.context.layers;

public class BankController {

	void createAccount(String accountHolderName, int inititlDeposit) {
		System.out.println("Create Account - controller");
		System.out.println(accountHolderName);
		System.out.println(inititlDeposit);

		BanService service = new BanService();
		service.createBankAccount(accountHolderName, inititlDeposit);
	}
}
