package com.syam.learn.java.stringz;

public class DisadvantageOfString {

	public static void main(String[] args) {

		String name = "Syam";
		name = name + " Prasad";
		name = name + " Kakumani";
		System.out.println(name);

		StringBuffer myName = new StringBuffer();
		myName.append("Syam");
		myName.append(" Prasad");
		myName.append(" Kakumani");
		System.out.println(myName);

		StringBuilder fullName = new StringBuilder();
		fullName.append("Syam");
		fullName.append(" Prasad");
		fullName.append(" Kakumani");
		System.out.println(fullName);

	}
}
