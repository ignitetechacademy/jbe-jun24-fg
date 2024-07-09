package com.syam.learn.java.assignments;

import java.util.Scanner;

public class CalculationsApp {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Select 1.Addition  2.Subtraction  3.Exit");
		int userSelection = userInput.nextInt();
		// System.out.println("Selected Option : " + userSelection);

		if (userSelection <= 3)
			handleRequest(userSelection, userInput);
		else
			throw new SyamException("Unable to connect with the DB");
	}

	static void handleRequest(int selectedOption, Scanner scanObj) {

		switch (selectedOption) {
		case 1: {
//			System.out.println("Addition ...");

			// user input & add values
			System.out.println("Add : First Number : ");
			int firstValue = scanObj.nextInt();

			System.out.println("Add : second Number : ");
			int secondValue = scanObj.nextInt();

			int total = firstValue + secondValue;
//			System.out.println("First " + firstValue + ", Second " + secondValue + " = " + total);
			System.out.printf("First %d, Second %d = %d \n", firstValue, secondValue, total);

			System.out.println("Select 1.Addition  2.Subtraction  3.Exit");
			int userSelection = scanObj.nextInt();
			handleRequest(userSelection, scanObj);

			break;
		}

		case 2: {
//			System.out.println("Subtraction ...");

			// user input & subtract values
			System.out.println("Sub : First Number : ");
			int firstValue = scanObj.nextInt();

			System.out.println("Sub : Second Number : ");
			int secondValue = scanObj.nextInt();

			int total = firstValue - secondValue;
//			System.out.println("First " + firstValue + ", Second " + secondValue + " = " + total);
			System.out.printf("First %d, Second %d = %d \n", firstValue, secondValue, total);

			System.out.println("Select 1.Addition  2.Subtraction  3.Exit");
			int userSelection = scanObj.nextInt();
			handleRequest(userSelection, scanObj);

			break;
		}

		case 3: {
			System.out.println("Exiting the Calclulations App ....");
			System.exit(0);
		}

		}
	}

}
