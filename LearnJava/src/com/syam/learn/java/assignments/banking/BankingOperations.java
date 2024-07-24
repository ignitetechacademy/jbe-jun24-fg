package com.syam.learn.java.assignments.banking;

import java.util.HashMap;
import java.util.Map;

public class BankingOperations {

	static Map<Integer, Account> accounts = new HashMap<>();

	static int openAccount(String name, int openingAmount) {

		int randomAccountNumber = (int) (Math.random() * 10000);

		Account ac = new Account(randomAccountNumber, name, openingAmount);
		System.out.println(ac);
		accounts.put(randomAccountNumber, ac);

		return randomAccountNumber;
	}

	static int depositMoney(int accountNumber, int amount) {

		boolean accountExists = checkAccount(accountNumber);
		int updatedBalance = 0;
		if (accountExists) {
			Account fetcedAccount = accounts.get(accountNumber);
			int exisitngBalance = fetcedAccount.getBalance();

			updatedBalance = exisitngBalance + amount;
			fetcedAccount.setBalance(updatedBalance);
			accounts.put(accountNumber, fetcedAccount);
		}

		return updatedBalance;
	}

	void withdrawMoney() {

	}

	static boolean checkAccount(int acNumber) {
		Account exisitngAccount = accounts.get(acNumber);

		if (exisitngAccount != null) {
			return true;
		} else {
			return false;
		}
	}
}
