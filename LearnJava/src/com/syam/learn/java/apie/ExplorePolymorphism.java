package com.syam.learn.java.apie;

public class ExplorePolymorphism {

	public static void main(String[] args) {

		add(10, 11);
		add(21, 31, 41);
		
		TaxCalculation txCalc = new ProductTaxCalculation();
		float taxAmount = txCalc.calculateTax(500);
		System.out.println(taxAmount);
		
		System.out.println("-------------");
		
		txCalc = new ServiceTaxCalculation();
		float totalTax = txCalc.calculateTax(500);
		System.out.println(totalTax);
	}

	static int add(int first, int second) {
		return first + second;
	}

	static int add(int first, int second, int third) {
		return first + second + third;
	}

}
