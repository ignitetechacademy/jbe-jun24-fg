package com.syam.learn.java.eight;

public class ExploreLambdasExtension {

	public static void main(String[] args) {
		Calculation cal = new Calculation() {

			@Override
			public int calValue(int first, int second) {
				return first + second;
			}
		};
		System.out.println(cal.calValue(120, 33));

		// create lambda
		Calculation subClac = (int first, int second) -> {
			return first - second;
		};
		System.out.println(subClac.calValue(120, 33));

		Calculation mulCalc = (first, second) -> {
			return first * second;
		};
		System.out.println(mulCalc.calValue(4, 8));
	}
}

interface Calculation {
	int calValue(int first, int second);
	// void hello();
}
