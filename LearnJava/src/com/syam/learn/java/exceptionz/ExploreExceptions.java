package com.syam.learn.java.exceptionz;

import java.io.FileNotFoundException;

public class ExploreExceptions {

	public static void main(String[] args) {

		System.out.println("Explore ...");

		DiscountCalculation discCalculation = new DiscountCalculation();

		int amountDiscounted = 0;
		try {
			amountDiscounted = discCalculation.calclulate(200);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(amountDiscounted);

		try {

		} catch (Exception e) {

		} finally {

		}

	}
}

class DiscountCalculation {

	int calclulate(int amount) throws FileNotFoundException {

		if (amount < 0) {
			throw new FileNotFoundException();
		}

		int standardDiscount = 9;

		int discountedAmount = amount * standardDiscount / 100;
		return discountedAmount;
	}

}
