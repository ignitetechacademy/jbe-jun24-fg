package com.syam.learn.java.typez;

import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;

@SuppressWarnings("unused")
public class ExploreAnnotations {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		int percentage = 98;

		String course = "Java Backend";

		@SuppressWarnings("rawtypes")
		List cities = new ArrayList();
		cities.add(100);
		cities.add(false);
		cities.add("syam");
	}

	void check() {
		String city = "Bangalore";
	}
}
