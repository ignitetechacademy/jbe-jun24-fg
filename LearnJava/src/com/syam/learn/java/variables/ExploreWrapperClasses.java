package com.syam.learn.java.variables;

public class ExploreWrapperClasses {

	public static void main(String[] args) {
		
//		int age = 130;
//		byte no = (byte) age;
//		System.out.println("Number : "+no);
//		
//		byte percentage = 87;
//		int totalPercentage = percentage;
//		
//		String mathsMarksString = "88";
//		byte scienceMarks = 82;
//		byte mathsMarks= (byte) mathsMarksString;
//		
//		System.out.println(mathsMarks + scienceMarks);
		
		
		Integer age = 130;
		byte no = age.byteValue();
		System.out.println("Number : "+no);
		
		String mathsMarksString = "88";
		byte scienceMarks = 82;
		byte mathsMarks= Byte.valueOf(mathsMarksString);
		
		System.out.println(mathsMarks + scienceMarks);
		
		
	}
}
