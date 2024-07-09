package com.syam.learn.java.collectionz;

public class ArraysExample {

	public static void main(String args[]) {

		String[] countries = { "India", "America" };

		String[] countryNames = new String[4];
		countryNames[0] = "India";
		countryNames[1] = "America";
		System.out.println(countryNames.length);
		
		countryNames[2] = "Newzeland";
		System.out.println(countryNames.length);
		System.out.println(countryNames[2]);
		
		countryNames[3] = "Britain";
		System.out.println(countryNames[3]);
		
		System.out.println(countryNames[0]);
		countryNames[0] = null;
		System.out.println(countryNames[0]);
	}
}
