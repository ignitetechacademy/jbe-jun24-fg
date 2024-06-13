package com.syam.learn.java.variables;


import java.util.Scanner;

public class ExploreVariables {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String name = scan.next();
		int contactNumber = 987655678;
		boolean instructor = true;

		// float marksPercentage = 71.5f;
		boolean distinction = false;

		String collegeName = args[0];
		String department = "Computer Science";

		int passoutYear = 2024;
		String address = "Bangalore, India";

		int firstSubjectMarks = scan.nextInt();
		int secondSubjectMarks = scan.nextInt();
		int thirdSubjectMarks = scan.nextInt();
		int fourthSubjectMarks = scan.nextInt();
		int fifthSubjectMarks = scan.nextInt();

		String status = null;

		int total = firstSubjectMarks + secondSubjectMarks + thirdSubjectMarks + fourthSubjectMarks + fifthSubjectMarks;
		float percentage = total / 5;

		if (percentage >= 35) {
			status = "Passed";
		} else {
			status = "Failed";
		}

		System.out.println(name + " from " + collegeName + " is " + status);
	}
}
