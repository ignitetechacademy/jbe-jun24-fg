package com.syam.learn.java.methodz;

import java.time.LocalDateTime;

public class FewMethods {

	void printName() {
		System.out.println("Syam Kakumani - AP");
	}

	void doubleValue(int value) {
		int valueDoubled = value * value;
		System.out.println(value + " = " + valueDoubled);
	}

	String getTime() {
		String time = LocalDateTime.now().toString();

		return time;
	}

	int addition(int first, int second) {
		return first + second;
	}
}
