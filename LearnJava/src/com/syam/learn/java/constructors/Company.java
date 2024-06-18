package com.syam.learn.java.constructors;

public class Company {

	String name;
	int startedYear;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartedYear() {
		return startedYear;
	}

	public void setStartedYear(int startedYear) {
		this.startedYear = startedYear;
	}

	public Company(String name) {
		super();
		this.name = name;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(String name, int startedYear) {
		super();
		this.name = name;
		this.startedYear = startedYear;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", startedYear=" + startedYear + "]";
	}
	
	

}
