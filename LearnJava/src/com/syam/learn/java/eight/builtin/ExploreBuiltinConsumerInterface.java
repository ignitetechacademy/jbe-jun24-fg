package com.syam.learn.java.eight.builtin;

import java.util.function.Consumer;

public class ExploreBuiltinConsumerInterface {

	public static void main(String[] args) {
		Consumer<String> greetConsumer = (String t) -> {
			System.out.println("Greetings - " + t);
		};
		greetConsumer.accept("Syam");

		Consumer<Integer> findConsumer = (value) -> {
			if (value % 2 == 0) {
				System.out.println(value + " - Even Number");
			} else {
				System.out.println(value + " - Odd Number");
			}
		};
		findConsumer.accept(1);

		Check c = new Check();
		c.checkOddEven(1);
	}
}

class Check {

	void checkOddEven(int value) {
		if (value % 2 == 0) {
			System.out.println(value + " - Even Number");
		} else {
			System.out.println(value + " - Odd Number");
		}
	}
}
