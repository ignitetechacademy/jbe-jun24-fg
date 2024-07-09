package com.syam.learn.java.collectionz;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExtendedExample {

	public static void main(String[] args) {
		// Set<Company> companiesSet = new HashSet<>();
		Set<Company> companiesSet = new TreeSet<>();
		companiesSet.add(new Company(123, "Akshara", "India"));

		Company microsoft = new Company(456, "MicroSfot", "America");
		companiesSet.add(microsoft);

		System.out.println("Execution Successful !!");
	}
}

class Company {
	int pinCode;
	String name;
	String country;

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Company(int pinCode, String name, String country) {
		super();
		this.pinCode = pinCode;
		this.name = name;
		this.country = country;
	}

	// getters, setters
	// constructors

}
