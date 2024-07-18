package com.syam.learn.java.collectionz;

import java.util.TreeSet;

public class ExploreComparable {

	public static void main(String[] args) {

		TreeSet<String> cities = new TreeSet<>();
		cities.add("Delhi");
		cities.add("Bangalore");
		cities.add("Chennai");
		System.out.println(cities);

		User u = new User(100, "Ramesh", "r@gmail.com");
		System.out.println(u.toString());

		TreeSet<User> users = new TreeSet<>();
		users.add(new User(111, "Syam", "syam@gmail.com"));
		users.add(new User(101, "Giri", "chgiri@gmail.com"));
		users.add(new User(99, "Krish", "kkrish@gmail.com"));
		System.out.println(users);
	}
}

class User extends Object implements Comparable<User> {
	int number;
	String name;
	String mail;

	@Override
	public String toString() {
		return "User [number=" + number + ", name=" + name + ", mail=" + mail + "]";
	}

	public User(int number, String name, String mail) {
		super();
		this.number = number;
		this.name = name;
		this.mail = mail;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public int compareTo(User o) {
//		int returnValue = 0;
//
//		if (this.getNumber() == o.getNumber())
//			returnValue = 0;
//
//		if (this.getNumber() > o.getNumber())
//			returnValue = 1;
//
//		if (this.getNumber() < o.getNumber())
//			returnValue = -1;
//
//		return returnValue;
		
		return this.name.compareTo(o.getName());
	}

}
