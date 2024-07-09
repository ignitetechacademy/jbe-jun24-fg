package com.syam.learn.java.exceptionz;

public class ExploreRuntimeExceptions {

	public static void main(String[] args) {

		String name = args[0];
		System.out.println(name);

		// System.out.println(args[1]);

		int firstNumber = 38;
		int secondNumber = Integer.valueOf(args[1]);

		System.out.println(firstNumber + secondNumber);

		String percentage = "295";
		byte percentageValue = Byte.valueOf(percentage);
		System.out.println(percentageValue);
	}
}
