package com.syam.learn.java.keywordz;

import java.util.Arrays;
import java.util.UUID;

public class ExploreFinalKeyword {

	public static void main(String[] args) {
		final int TOTAL_VALUE = 85;
		System.out.println(TOTAL_VALUE);

		String name;
		Integer i;
		Math m;
		UUID u;

//		value = 89;
//		System.out.println(value);

		VegRestaurant veg = new VegRestaurant();
//		veg.info();
//		veg.owner();
	}

}

// final class Restaurant {
class Restaurant {
	void info() {
		System.out.println("Restaurant Info ...");
	}

	// final void owner() {
	void owner() {
		System.out.println("Owner of the Restaturant");
	}
}

class VegRestaurant extends Restaurant {
}
