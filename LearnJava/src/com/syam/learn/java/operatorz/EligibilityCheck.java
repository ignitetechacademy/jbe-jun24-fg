package com.syam.learn.java.operatorz;

public class EligibilityCheck {

	boolean canVote(int age) {
		if (age >= 21)
			return true;
		else
			return false;
	}
	
	boolean isPassed(int marks){
		if(marks <= 35)
			return false;
		else
			return true;
	}

}
