package com.syam.learn.java.assignments;

import java.util.Iterator;

public class CityCount {

	public static void main(String[] args) {
		String[] cities = { "BANGALORE", "Bangalore", "Chennai", "Hyderabad", "delhi", "bangalore", "HDERABAD" };
		System.out.println(cities.length);
		System.out.println(cities[0]);

		System.out.println("-------------------");

		String[] lowercaseCities = new String[7];
		for (int i = 0; i < cities.length; i++) {
			lowercaseCities[i] = cities[i].toLowerCase();
		}
		System.out.println(lowercaseCities[0]);

		String[] citiesList = new String[7];
		for (int i = 0; i < lowercaseCities.length; i++) {
			if (i == 0) {
				citiesList[0] = lowercaseCities[0] + "+1";
				continue;
			}

			String cityName = lowercaseCities[i];
			System.out.println(cityName);

			for (int j = 0; j < citiesList.length; j++) {
				if (null != citiesList[j]) {
					String currentCity = citiesList[j];
					System.out.println("Current City : " + currentCity);

					int cityCount = Integer
							.valueOf(currentCity.substring(currentCity.indexOf('+'), currentCity.length()));
					System.out.println("Current City Count: " + cityCount);

					String currentCityName = currentCity.substring(0, currentCity.indexOf('+'));
					System.out.println("Current City Name: " + currentCityName);

					if (cityName.equals(currentCityName)) {
						cityCount = cityCount + 1;
						citiesList[j] = currentCityName + "+" + cityCount;
						System.out.println(citiesList[j]);
					} else {

					}
				}
			}

			for (int j = 0; j < citiesList.length; j++) {
				System.out.println(citiesList[j]);
			}
		}
	}
}
