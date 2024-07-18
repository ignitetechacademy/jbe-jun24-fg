package com.syam.learn.java.apie;

public class ExploreOverrriding {

	public static void main(String[] args) {

		BookReading book = new IslamicBookReading();
		book.read("all is well");
	}

	void main() {
		System.out.println("I'm not a the execution method");
	}
}

class BookReading {

	void read(String paragraph) {
		System.out.println(paragraph);
	}
}

class IslamicBookReading extends BookReading {
	@Override
	void read(String paragraph) {
		System.out.println(new StringBuilder(paragraph).reverse());
	}
}
