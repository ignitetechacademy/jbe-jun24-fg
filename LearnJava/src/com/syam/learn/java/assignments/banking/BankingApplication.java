package com.syam.learn.java.assignments.banking;

import java.util.Scanner;

public class BankingApplication {

	static String optionTypes = "1.Open Account \t 2.Deposit \t 3.Withdraw \t 4.Exit";

	public static void main(String[] args) {
		BankingOperations ops = new BankingOperations();

		System.out.println("Bangking Application");

		Scanner userInput = new Scanner(System.in);
		System.out.println(optionTypes);
		int userSelectedOption = userInput.nextInt();
		System.out.println("User Selection : " + userSelectedOption);

		processUserRequest(userSelectedOption, userInput, ops);

	}

	static void processUserRequest(int userInput, Scanner s, BankingOperations ops) {
		switch (userInput) {
		case 1: {
			System.out.println("Opeaning Account");

			System.out.println("Please Provide - Account Holder Name : ");
			String name = s.next();

			System.out.println("Please Enter - Opening Balanace : ");
			int openingAmount = s.nextInt();

			int accountNumber = ops.openAccount(name, openingAmount);
			System.out.println("Account number of " + name + " is : " + accountNumber);

			System.out.println(optionTypes);
			int nextSelection = s.nextInt();
			processUserRequest(nextSelection, s, ops);
			break;
		}

		case 2: {
			System.out.println("Deposit Money");

			System.out.println("Enter Account Number - ");
			int acNo = s.nextInt();

			System.out.println("Enter amount to deposit - ");
			int depositAmount = s.nextInt();

			int updatedBalance = ops.depositMoney(acNo, depositAmount);
			System.out.println("Total Balance in your account : " + updatedBalance);

			System.out.println(optionTypes);
			int nextSelection = s.nextInt();
			processUserRequest(nextSelection, s, ops);
			break;
		}

		case 3: {
			System.out.println("Withdraw Money");

			// write logic to withdraw money

			System.out.println(optionTypes);
			int nextSelection = s.nextInt();
			processUserRequest(nextSelection, s, ops);
			break;
		}
		case 4: {
			System.out.println("Bye Bye ...");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + userInput);
		}

	}

}
