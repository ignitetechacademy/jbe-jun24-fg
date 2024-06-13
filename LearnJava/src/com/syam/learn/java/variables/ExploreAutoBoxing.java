package com.syam.learn.java.variables;

public class ExploreAutoBoxing {

	public static void main(String[] args) {

		int percentage = 100;
		Integer totalPercentage = percentage;
		System.out.println("Percentage  : " + totalPercentage);

		Double tax = 7.5;
		double newTax = tax;
		System.out.println("Tax : " + newTax);
	}

}
