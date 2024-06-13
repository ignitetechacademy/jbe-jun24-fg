package com.syam.learn.java.clazz;

public class ExploreExecution {

	public static void main(String[] args) {
		System.out.println("This is a execution class");

		String name = "Syam Kakumani";
		String college = "PGP CAS";
		int graduationYear = 2004;
		String deparment = "MCA";

		System.out.println(name + " - " + college + " - " + graduationYear + " - " + deparment);
		
		ExploreExecution ee = new ExploreExecution();
		ee.printInfo(    name, college, graduationYear, deparment   );
		
		Student syam = new Student();
		syam.setStuName(name);  // syam.setStuName("Syam Kakumani");
		syam.setStuCollege(college);
		syam.setCompletedYear(graduationYear);
		syam.setStuDepartment(deparment);
		
		ee.printStudentInfo(syam);
		
		StudentCRUD scrud = new StudentCRUD();
		String stdId = scrud.createStudent(syam);
		System.out.println(stdId);
		
		int genEmpId = scrud.createStudent(name, college, graduationYear, deparment);
		System.out.println(genEmpId);
	}
	
	void printStudentInfo(Student stud) {
		System.out.println(stud.getStuName() + " $$ " + stud.getStuCollege() + " $$ " + stud.getCompletedYear() + " $$ " + stud.getStuDepartment());
	}
	
	
	 void printInfo(String studentName, String studentCollege, int studentGrauationYear, String studentDepartment) {
		System.out.println(studentName + " ## " + studentCollege + " ## " + studentGrauationYear + " ## " + studentDepartment);
	}
	
	
}
