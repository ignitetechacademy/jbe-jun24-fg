package com.syam.learn.java.operatorz;

public class TernaryOperatorDemo {

	public static void main(String[] args) {

		String division = null;
		int percentage = 75;

		if (percentage > 80) {
			division = "First Calss";
			System.out.println("++++++++++");
		} else {
			division = "Second Class";
			System.out.println("-------------");
		}

		System.out.println("1 Student passed in : " + division);

		division = percentage > 80  ? "First Calss" : "Second Class";
		System.out.println("2 Student passed in : " + division);
	}
}
