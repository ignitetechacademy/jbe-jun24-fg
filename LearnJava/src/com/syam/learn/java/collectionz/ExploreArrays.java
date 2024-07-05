package com.syam.learn.java.collectionz;

public class ExploreArrays {

	public static void main(String[] args) {
		
		Student[] studentsData = new Student[5];
		
		Student syam = new Student("Syam Kakumani", 123);
		studentsData[0] = syam;
		
		studentsData[1] = new Student("Girish", 222);
		studentsData[2] = new Student("Krish", 333);
		studentsData[3] = new Student("Koush", 444);
		
		Student ravi = new Student("Ravi", 555);
		studentsData[4] = ravi;
		
		int studentIdToSearch = 555;
		for (int i = 0; i < studentsData.length; i++) {
			if(studentsData[i].getId() == studentIdToSearch) {
				System.out.println(studentsData[i].getName());
			}
			else {
				System.out.println("Not - " + studentsData[i].getName());
			}
		}
		
		
		int[] studentsMarks = new int[3];
		studentsMarks[0] = 74;
		studentsMarks[1] = 85;
		studentsMarks[2] = 99;
		
		System.out.println(studentsMarks[1]);
		
		String[] cities = new String[4];
		cities[0] = "Karnataka";
		cities[1] = "Andhra Pradesh";
		cities[2] = "Karnataka";
		cities[3] = "Tamil Nadu";
		System.out.println(cities.length);	
	}
}
