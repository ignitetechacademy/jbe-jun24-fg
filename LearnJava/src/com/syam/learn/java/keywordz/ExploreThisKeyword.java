package com.syam.learn.java.keywordz;

public class ExploreThisKeyword {

	static int valueOne;
	static int valueTwo;

	public static void main(String[] args) {
		System.out.println(valueOne);
		System.out.println(valueTwo);

		int sumValue = add(100, 1000);
		System.out.println(sumValue);
	}

	static int add(int valueOne, int valueTwo) {
		valueOne = valueOne;
		valueTwo = valueTwo;

		return valueOne + valueTwo;
	}

	void subtract() {

	}

}
