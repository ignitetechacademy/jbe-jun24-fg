package com.syam.learn.java.apie;

public class ServiceTaxCalculation implements TaxCalculation {

	int servieTax = 6;

	@Override
	public float calculateTax(int price) {
		float taxAmount = price * servieTax / 100;

		return taxAmount;
	}
}
