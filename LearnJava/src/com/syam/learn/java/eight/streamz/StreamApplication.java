package com.syam.learn.java.eight.streamz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * This is an application to know the Stream concepts
 */

public class StreamApplication {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("Dinesh", "ECE", 86), new Student("Manju", "IT", 81),
				new Student("Nivedha", "IT", 77), new Student("Rajitha", "ECE", 88), new Student("Jagan", "ECE", 66));

		for (Student student : studentList) {
			System.out.println(student);
		}

		System.out.println("------------------------");

		List<Student> itStudents = new ArrayList<>();

		for (Student student : studentList) {
			if (student.getDepartment().equals("IT")) {
				itStudents.add(student);
			}
		}
		System.out.println(itStudents);

		for (Student student : itStudents) {
			int oldPercentage = student.getPercentage();
			student.setPercentage(oldPercentage + 2);
		}
		System.out.println(itStudents);

		System.out.println("##############################");

		List<Student> newStudentList = Arrays.asList(new Student("Dinesh", "ECE", 86), new Student("Manju", "IT", 81),
				new Student("Nivedha", "IT", 77), new Student("Rajitha", "ECE", 88), new Student("Jagan", "ECE", 66));

		Predicate<Student> studentPredicate = (s) -> {
			return s.getDepartment().equals("IT");
		};

		Stream<Student> studentsStream = newStudentList.stream();
		// System.out.println(studentsStream.count());

		Stream<Student> itStudentsStream = studentsStream.filter(studentPredicate);
		// System.out.println(itStudentsStream.count());

		Function<Student, Student> studentFunction = (std) -> {
			int stdOldPercentage = std.getPercentage();
			std.setPercentage(stdOldPercentage + 2);
			return std;
		};

		Stream<Student> updatedItStudentsStream = itStudentsStream.map(studentFunction);
		// System.out.println(updatedItStudentsStream.count());

		List<Student> finalStudentList = updatedItStudentsStream.toList();
		System.out.println(finalStudentList);

		System.out.println("********************************");

		List<Student> anotherStudentList = Arrays.asList(new Student("Dinesh", "ECE", 86),
				new Student("Manju", "IT", 81), new Student("Nivedha", "IT", 77), new Student("Rajitha", "ECE", 88),
				new Student("Jagan", "ECE", 66));

		List<Student> streamProcessStudents = anotherStudentList.stream()
				                                                .filter(s -> s.getDepartment().equals("IT"))
				                                                .map(std -> {
				                                                			std.setPercentage(std.getPercentage() + 2);
				                                                			return std;
				                                                	})
				                                                .toList();
		System.out.println(streamProcessStudents);

	}

}

class Student {
	String name;
	String department;
	int percentage;

	@Override
	public String toString() {
		return "Studnet [name=" + name + ", department=" + department + ", percentage=" + percentage + "]";
	}

	public Student(String name, String department, int percentage) {
		super();
		this.name = name;
		this.department = department;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}
