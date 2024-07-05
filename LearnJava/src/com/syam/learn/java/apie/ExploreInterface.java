package com.syam.learn.java.apie;

public class ExploreInterface {

	public static void main(String[] args) {

		Calc calculations = new Calc();
		int total = calculations.add(12, 13);
		System.out.println(total);
		
		ServiceTaxCalculation taxCalc = new ServiceTaxCalculation();
		float taxAmount = taxCalc.calculateTax(300);
		System.out.println(taxAmount);
		
		ProductTaxCalculation proTax = new ProductTaxCalculation();
		float proTaxAmount = proTax.calculateTax(500);
		System.out.println(proTaxAmount);
	}
}
