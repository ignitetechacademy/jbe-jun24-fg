package com.syam.learn.java.collectionz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExploreForEach {

	public static void main(String[] args) {

		List<String> cities = Arrays.asList("Bangalore", "Chennai", "Delhi");
		// List<String> cities = Arrays.asList();
		System.out.println(cities);

		List<String> citiesList = new ArrayList<>();
		citiesList.add("Bangalore");
		citiesList.add("Chennai");
		citiesList.add("Delhi");
		System.out.println(citiesList);

		System.out.println("----------------------");

		for (int i = 0; i < cities.size(); i++) {
			System.out.println("Citi Name - " + cities.get(i));
		}

		System.out.println("````````````````````````````````");

		for (String city : cities) {
			System.out.println("Citi Name : " + city);
		}

	}
}
