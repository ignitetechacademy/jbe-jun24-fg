package com.syam.learn.java.constructors;

public class ExploreConstructors {

	public static void main(String[] args) {
		
		Company akshara = new Company();
		akshara.setName("Akshara Softwares");
		akshara.setStartedYear(2012);
		
		System.out.println(akshara.toString());
		System.out.println(akshara);
		
		
		Company microsoft = new Company();
		microsoft.setName("Microsoft Corporation");
		microsoft.setStartedYear(1985);
		
		Company infosys = new Company("Infosys Limited");
		infosys.setStartedYear(1989);
		
		Company wipro = new Company("Wipro Technologies", 1992);
		System.out.println(wipro.getName());
		System.out.println(wipro);
	}

}
