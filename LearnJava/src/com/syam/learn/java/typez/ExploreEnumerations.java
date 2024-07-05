package com.syam.learn.java.typez;

public class ExploreEnumerations {

	public static void main(String[] args) {

		String lowercaseJava = "java";
		System.out.println(lowercaseJava);

		String upperaseJava = "JAVA";
		System.out.println(upperaseJava);

		String java = "Java";
		System.out.println(java);

		// Courses course = Courses.JAVA;
		Courses course = Courses.valueOf(lowercaseJava.toUpperCase());
		// Courses course = Courses.valueOf(upperaseJava);
		// Courses course = Courses.valueOf(java.toUpperCase());

		switch (course) {
		case JAVA: {
			System.out.println("Java Programming");
			break;
		}

		case PYTHON: {
			System.out.println("Python Programming");
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + course);
		}
	}
}
