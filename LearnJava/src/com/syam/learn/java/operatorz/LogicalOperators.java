package com.syam.learn.java.operatorz;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int marks = 88;
		
		if(marks > 35 && marks >= 80) {
			System.out.println("Pass in Distinction");
		}
		else {
			System.out.println("Evaluate further condition");
		}
		
		
		int personAge = 20;
		boolean celebrity = false;
		
		if (celebrity || personAge >= 21) {
			System.out.println("Entry to the Venue");
		} else {
			System.out.println("Not eligible to enter the venue");
		}
	}
}
