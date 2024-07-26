package com.syam.learn.java.conceptz;

public class ExplorePassByValue {

	public static void main(String[] args) {

		int fValue = 10;
		int sValue = 20;
		System.out.println("Before : " + fValue);

		Calculations calc = new Calculations();
		calc.addition(fValue, sValue);
		System.out.println("After : " + fValue);
	}
}

class Calculations {

	int addition(int first, int second) {
		int sum = first + second;
		first = 300;

		return sum;
	}
}
