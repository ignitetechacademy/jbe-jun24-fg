package com.learn.spring.context.layers;

public class BankLayaeredApp {

	public static void main(String[] args) {

		// create an account
		String name = "Lakshmi";
		int balance = 2200;
		
		BankController controller = new BankController();
		controller.createAccount(name, balance);
	}

}
