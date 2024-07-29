package com.syam.learn.java.keywordz;

public class ExploreSuperConstructors {

	public static void main(String[] args) {
		CommercialBank worldBank = new CommercialBank("World Bank", "ABC", 2000);
		System.out.println(worldBank);
	}
}

class Bank {
	String name;
	String founder;

	public Bank(String name, String founder) {
		super();
		this.name = name;
		this.founder = founder;
	}

	void updateFounder(String value) {
		founder = "Founder: " + value;
	}

}

class CommercialBank extends Bank {

	int startedYear;

	public CommercialBank(String name, String founder, int startedYear) {
		super(name, founder);
		super.updateFounder(founder);
		this.startedYear = startedYear;
	}

	@Override
	public String toString() {
		return "CommercialBank [startedYear=" + startedYear + ", name=" + name + ", founder=" + founder + "]";
	}

}
