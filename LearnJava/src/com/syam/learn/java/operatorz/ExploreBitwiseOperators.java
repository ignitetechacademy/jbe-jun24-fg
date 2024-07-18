package com.syam.learn.java.operatorz;

public class ExploreBitwiseOperators {

	public static void main(String[] args) {

		int firstValue = 9;
		int secondValue = 5;
		
		System.out.printf("%d & %d = %d", firstValue, secondValue, firstValue & secondValue);
		System.out.println();
		
		System.out.printf("%d | %d = %d", firstValue, secondValue, firstValue | secondValue);
		System.out.println();
		
		System.out.printf("%d ^ %d = %d", firstValue, secondValue, firstValue ^ secondValue);
		System.out.println();
		
		System.out.printf("%d = %d", firstValue, ~firstValue);
	}
}
