package com.syam.learn.java.memoriez;

public class ExploreMemory {

	public static void main(String[] args) {

		int[] collegeMarks = new int[5000000];
		System.out.println(collegeMarks.length);

		// perform calculations on the marks
		collegeMarks = null;
		Runtime.getRuntime().gc();
		
		String name = "Syam Kakumani";
		System.out.println(name); 

	}
}
