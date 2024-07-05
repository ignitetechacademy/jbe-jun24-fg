package com.syam.learn.java.operatorz;

public class ArithmeticExample {

	public static void main(String[] args) {

		int starters = 300;
		int soups = 400;
		int mainCourse = 500;
		int desserts = 600;

		Calculations cal = new Calculations();
		int twoSoups = cal.mul(soups, 2);

		int twoItemsValue = cal.add(starters, twoSoups);
		int threeItemsValue = cal.add(twoItemsValue, mainCourse);
		int billAmount = cal.add(threeItemsValue, desserts);
		System.out.println("Bill Value : " + billAmount);

		byte discountPercentage = 15;
		int finalBill = billAmount - (billAmount * discountPercentage / 100);
		System.out.println("Final Bill amount : " + finalBill);

		byte personsCount = 3;
		int eachPersonshare = cal.div(finalBill, personsCount);
		System.out.println("Each Person share amount : "+eachPersonshare);
		
	}
}
