package com.syam.learn.java.variables;

public class VariablesScope {
	
	static String country;

	public static void main(String[] args) {

		String city = "Bangalore";
		System.out.println("City Name : " + city);
		
		
		System.out.println("My Country : "+country);
	}
	
	
	
	void printCountryName() {
		
		System.out.println("Country Name is : " + country);
		
	}

}
