package com.syam.learn.java.collectionz;

import java.util.HashMap;
import java.util.Map;

public class ExploreMap {

	public static void main(String[] args) {
		Student[] studentsData = new Student[5];
		studentsData[0] = new Student("Syam Kakumani", 123);
		studentsData[1] = new Student("Girish", 222);
		studentsData[2] = new Student("Krish", 333);
		studentsData[3] = new Student("Koush", 444);
		studentsData[4] = new Student("Ravi", 555);

		int studentIdToSearch = 555;
		for (int i = 0; i < studentsData.length; i++) {
			if (studentsData[i].getId() == studentIdToSearch)
				System.out.println(studentsData[i].getName());
			else
				System.out.println("Not - " + studentsData[i].getName());
		}

		System.out.println("--------------------------");

		Map<Integer, Student> studentMap = new HashMap<>();
		studentMap.put(123, new Student("Syam Kakumani", 123));
		studentMap.put(222, new Student("Girish", 222));
		studentMap.put(333, new Student("Krish", 333));
		studentMap.put(444, new Student("Koush", 444));
		
		Student raviObj = new Student("Ravi", 555);
		studentMap.put(555, raviObj);
	
		Student searchObject = studentMap.get(studentIdToSearch);
		System.out.println(searchObject.getName());
	}
}
