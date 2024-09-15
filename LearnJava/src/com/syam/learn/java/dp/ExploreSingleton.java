package com.syam.learn.java.dp;

public class ExploreSingleton {

	public static void main(String[] args) {
		Greetz gz = Greetz.createInstance();
		gz.greetings();
		System.out.println(gz);

		Greetz gz2 = Greetz.createInstance();
		gz2.greetings();
		System.out.println(gz2);

		Greetz gz3 = Greetz.createInstance();
		gz3.greetings();
		System.out.println(gz3);
	}
}

class Greetz {

	static Greetz g = null;

	private Greetz() {
	}

	static Greetz createInstance() {
		if (g == null)
			g = new Greetz();

		return g;
	}

	void greetings() {
		System.out.println("Seasonal Greetings ...");
	}
}
