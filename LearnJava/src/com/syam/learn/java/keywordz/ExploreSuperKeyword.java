package com.syam.learn.java.keywordz;

public class ExploreSuperKeyword {

	public static void main(String[] args) {
		EmployeeUser eu = new EmployeeUser("syam", "s123", "admin");
		System.out.println(eu);
	}
}

class User {
	String name;
	String password;
	String role;

	int userCount = 100;

	void parentInfo() {
		System.out.println("User is a parent calss for all users");
	}

	public User(String name, String password, String role) {
		super();
		this.name = name;
		this.password = password;
		this.role = role;
	}
}

class EmployeeUser extends User {

	public EmployeeUser(String name, String password, String role) {
		super(name, password, role);
		super.parentInfo();
		System.out.println(super.userCount);
	}

	@Override
	public String toString() {
		return "EmployeeUser [name=" + name + ", password=" + password + ", role=" + role + "]";
	}

}
