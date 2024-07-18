package com.syam.learn.java.genericz;

public class ExploreGenerics {

	public static void main(String[] args) {
		Calculations calc = new Calculations();
		System.out.println(calc.add(11, 27));
		System.out.println(calc.add(12.5f, 35.0f));

		System.out.println("------------");

		Calc<Integer> calculations = new Calc();
		int sum = calculations.add(123, 456);
		System.out.println(sum);

		Calc<Float> calculationz = new Calc();
		float total = calculationz.add(11.50f, 15.75f);
		System.out.println(total);
	}
}

class Calc<SYAM> {

	SYAM add(SYAM first, SYAM second) {
		System.out.println(first);
		System.out.println(second);

		if (first.getClass() == Integer.class)
			return (SYAM) (Integer) ((Integer) first + (Integer) second);

		if (first.getClass() == Float.class)
			return (SYAM) (Float) ((Float) first + (Float) second);

		return null;
	}
}

class Calculations {
	int add(int first, int second) {
		return first + second;
	}

	float add(float first, float second) {
		return first + second;
	}
}
