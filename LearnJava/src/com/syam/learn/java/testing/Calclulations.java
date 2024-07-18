package com.syam.learn.java.testing;

public class Calclulations {

	public int addition(int firstValue, int secondValue) {
		return firstValue + secondValue;
	}

	int multiplication(int firstValue, int secondValue) {
		return firstValue * secondValue;
	}

	void testAddition(int firstNumber, int secondNumber, int result) {

		int value = addition(firstNumber, secondNumber);

		if (value == result) {
			System.out.println("Addition working fine");
		} else {
			System.out.println("Adddition is returning unexpected value");
		}
	}
	
	void testMutiplication(int firstNumber, int secondNumber, int result) {

		int value = multiplication(firstNumber, secondNumber);

		if (value == result) {
			System.out.println("Multiplication working fine");
		} else {
			System.out.println("Multiplication is returning unexpected value");
		}
	}
}
