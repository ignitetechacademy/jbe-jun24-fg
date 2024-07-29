package com.syam.learn.java.keywordz;

public class ExploreThisConstructor {

	public static void main(String[] args) {
		Company kitKat = new Company("Nestle Inc");
		System.out.println(kitKat);

		Company thumsUp = new Company("Coca Cola", "America");
		System.out.println(thumsUp);
	}
}

class Company {

	String name;
	String country;
	
	String founder;

	
	public Company(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", country=" + country + "]";
	}

	public Company(String name, String country) {
		this(name);
		this.country = country;
	}
	
	public Company(String name, String country, String founder) {
		this(name, country);
//		super();
//		this.name = name;
//		this.country = country;
		this.founder = founder;
	}


}
