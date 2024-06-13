package com.syam.learn.java.clazz;

public class StudentCRUD {

	// create student
	String createStudent(Student student) {
		System.out.println("Student " + student.getStuName() + " created successfully ...");

		String generatedStudentId = student.getStuName().toUpperCase() + student.getCompletedYear();
		return generatedStudentId;
	}

	int createStudent(String name, String college, int year, String department) {
		System.out.println("Student Creation Successful - " + name);

		int randomNumber = (int) (Math.random() * 10000);
		return randomNumber;
	}

	
	// retrieve student
	// update student
	// delete student

}
