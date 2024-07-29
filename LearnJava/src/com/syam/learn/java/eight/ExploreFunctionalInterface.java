package com.syam.learn.java.eight;

public class ExploreFunctionalInterface {

	public static void main(String[] args) {

		// System.out.println((10000 * 1 * 12 / 100));

		InterestCalculation simpleInterest = (int principle, int roi, int tenure) -> {
			return (principle * tenure * 12 / 100);
		};
		int interest = simpleInterest.calculate(100000, 12, 1);
		System.out.println(interest);

	}
}

@FunctionalInterface
interface InterestCalculation {
	public abstract int calculate(int principle, int roi, int tenure);
	
	// void check();
}
