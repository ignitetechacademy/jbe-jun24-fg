package com.syam.learn.java.variables;

public class ExploreStaticVariables {

	public static void main(String[] args) {

		Course excel = new Course();
		System.out.println(excel);

		Course java = new Course("Core Java", 10000, "offline");
		Course oracle = new Course("Oracle PL/SAL", 15000, "online");
		Course python = new Course("Testing using Python", 22000, "offline");

		Course tally = new Course();
	}
}

class Course {

	static int courseCount = 0;

	String name;
	int fees;
	String mode;

	@Override
	public String toString() {
		return "Course [courseCount=" + courseCount + ", name=" + name + ", fees=" + fees + ", mode=" + mode + "]";
	}

	// getters setters
	// constructor using fields
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Course(String name, int fees, String mode) {
		super();
		this.name = name;
		this.fees = fees;
		this.mode = mode;

		System.out.println("Courses : " + ++courseCount);
	}

	public Course() {
		super();
		System.out.println("Courses : " + ++courseCount);
	}

}
