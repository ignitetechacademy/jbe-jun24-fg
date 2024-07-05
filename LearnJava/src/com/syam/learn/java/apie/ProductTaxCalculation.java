package com.syam.learn.java.apie;

public class ProductTaxCalculation implements TaxCalculation {

	int productTax = 8;

	@Override
	public float calculateTax(int price) {
		float taxValue = price * productTax / 100;
		return taxValue;
	}
}
