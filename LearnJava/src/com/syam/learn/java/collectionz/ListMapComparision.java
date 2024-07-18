package com.syam.learn.java.collectionz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMapComparision {

	public static void main(String[] args) {

		List<Teacher> youtubeTeachers = Arrays.asList(
				new Teacher("naveen", 111), 
				new Teacher("mosh", 222),
				new Teacher("viswa", 444), 
				new Teacher("durga", 555),
				new Teacher("yadagiri", 333));

		for (Teacher teacher : youtubeTeachers) {
			if (teacher.getNumber() == 333) {
				System.out.println("Teacher name : " + teacher.getName());
			} else {
				System.out.println("Teacher number : " + teacher.getNumber());
			}
		}
		
		Map<Integer, Teacher> ytTeacher = new HashMap<>();
		ytTeacher.put(111, new Teacher("naveen", 111));
		ytTeacher.put(222, new Teacher("mosh", 222));
		ytTeacher.put(444, new Teacher("viswa", 444));
		ytTeacher.put(555, new Teacher("durga", 555));
		ytTeacher.put(333, new Teacher("yadagiri", 333));
		
		Teacher teacher333 = ytTeacher.get(333);
		System.out.println(teacher333.getName());
		
		

	}

}

class Teacher {

	String name;
	int number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Teacher(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

}
