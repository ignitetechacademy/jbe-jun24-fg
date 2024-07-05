package com.syam.learn.java.operatorz;

public class RelationalOperators {

	public static void main(String[] args) {

		int syamAge = 15;

		EligibilityCheck eCheck = new EligibilityCheck();

		if (eCheck.canVote(syamAge))
			System.out.println("Eligible to Vote");
		else
			System.out.println("Not eligible");

		int marks = 73;
		if(eCheck.isPassed(marks))
			System.out.println("Passed the Exam");
		else
			System.out.println("Fail in the exam");
	}
}


