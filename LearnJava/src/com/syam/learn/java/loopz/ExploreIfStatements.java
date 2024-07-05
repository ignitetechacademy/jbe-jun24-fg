package com.syam.learn.java.loopz;

public class ExploreIfStatements {

	public static void main(String[] args) {

		// if and switch blocks
		int marks = 75;
		if (marks > 35) {
			System.out.println("Passed");

			if (marks > 80) {
				System.out.println("Grade A");
			} else {
				System.out.println("Grade B");
			}

		} else {
			System.out.println("Failed");
		}

	}
}
