package com.syam.learn.java.typez;

public class UsrrnameCheck {

	public static void main(String[] args) {

		String name = "syam";
		String myName = "SYAM";
		String userName = "Syam";

		// String nametoCheck = name;
		// String nametoCheck = myName.toLowerCase();
		 String nametoCheck = userName.toLowerCase();

		// if(nametoCheck.equals("SYAM") || nametoCheck.equals("SYAM") ||
		// nametoCheck.equals("Syam") || nametoCheck.equals("syAm")) {

		if (nametoCheck.equals("syam")) {
			System.out.println("Valid User");
		} else {
			System.out.println("Invalid User  - can't proceed");
		}

	}

}
