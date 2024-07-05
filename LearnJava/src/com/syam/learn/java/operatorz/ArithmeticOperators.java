package com.syam.learn.java.operatorz;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int valueOne = 11;
		int valueTwo = 22;
		int valueThree = 33;
		
		int total=0; // 66
		System.out.println("total : "+total);
		
		Calculations calc = new Calculations();
		// calc.addition(valueOne, valueTwo);
		
		total = calc.add(valueOne, valueTwo);
		System.out.println("2 number total : "+total);
		
		total = calc.add(total, valueThree);
		System.out.println("3 number toal : "+total);
		
		
		
	}
}
