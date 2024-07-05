package com.syam.learn.java.stringz;

public class ExploreStrings {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("kakumani-thread");

		int totalMarks = 100;
		totalMarks++;

		System.out.println(totalMarks);

		String name = "Syam";
		System.out.println(name);

		name = name + " Kakumani";
		System.out.println(name);

		String name2 = "Syam";
		String name3 = "Syam";
		String name4 = "Syam";
		String name5 = "Syam";
		String name6 = "Syam";

		name6 = name6 + ", Bangalore";

		String course = new String("Java Backend Engineering");
		String jbeCourse = new String("Java Backend Engineering");

	}
}
