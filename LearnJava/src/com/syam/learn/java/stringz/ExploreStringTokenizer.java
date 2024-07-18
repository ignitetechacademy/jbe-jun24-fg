package com.syam.learn.java.stringz;

import java.util.StringTokenizer;

public class ExploreStringTokenizer {

	public static void main(String[] args) {

		String value = "Syam,Prasad,Kakumani";

		StringTokenizer valueTokens = new StringTokenizer(value, ",");
		int nameCount = valueTokens.countTokens();

		switch (nameCount) {
		case 1: {
			System.out.println("First Name");
			break;
		}

		case 2: {
			System.out.println("First Name, Last Name");
			break;
		}

		case 3: {
			System.out.println("Full Name");
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + nameCount);
		}

	}
}
