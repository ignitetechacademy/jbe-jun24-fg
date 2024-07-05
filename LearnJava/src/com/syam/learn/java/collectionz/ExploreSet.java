package com.syam.learn.java.collectionz;

import java.util.HashSet;
import java.util.Set;

public class ExploreSet {

	public static void main(String[] args) {
		String[] cities = new String[4];
		cities[0] = "Karnataka";
		cities[1] = "Andhra Pradesh";
		cities[2] = "Karnataka";
		cities[3] = "Tamil Nadu";
		System.out.println(cities.length);
		
		Set<String> citiesSet = new HashSet<>();
		citiesSet.add("Karnataka");
		citiesSet.add("Andhra Pradesh");
		citiesSet.add("Karnataka");
		citiesSet.add("Tamil Nadu");
		System.out.println(citiesSet.size());

	}
}
