package com.syam.learn.java.assignments;

import java.util.Scanner;

public class ExamResults {

	public static void main(String[] args) {
		Scanner userInputScanner = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = userInputScanner.next();
		
		System.out.println("Enter College name");
		String college = userInputScanner.next();
		
		System.out.println("Enter No of Subjects : ");
		int subjectCount =userInputScanner.nextInt();
		
		int[] subjectMarks = new int[subjectCount];
		
		for (int i = 0; i < subjectMarks.length; i++) {
			System.out.println("Enter MArks for Subject : "+ (i+1));
			subjectMarks[i] = userInputScanner.nextInt();	
		}
		
		int totalMarks = 0;
		for (int i = 0; i < subjectMarks.length; i++) {
			totalMarks = totalMarks + subjectMarks[i];
		}
		System.out.println("Total Marks : "+totalMarks);
		
		boolean fail = false;
		for (int i = 0; i < subjectMarks.length; i++) {
			if(subjectMarks[i] < 35 ) {
				fail = true;
				break;
			}
		}
		
		float percentage = (totalMarks / subjectCount);
		
		if(fail) {
			System.out.println(name + " - " + percentage + " - Failed");
		}
		else {
			System.out.println(name + " - " + percentage + " - Passed");
		}
	}
}
