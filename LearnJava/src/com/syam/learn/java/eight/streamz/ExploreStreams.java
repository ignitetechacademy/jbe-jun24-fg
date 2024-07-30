package com.syam.learn.java.eight.streamz;

public class ExploreStreams {

	public static void main(String[] args) {
		String name = "Syam";
		char[] nameChars = name.toCharArray();

		for (int i = 0; i < nameChars.length; i++) {
			System.out.println(nameChars[i]);
		}

		System.out.println("-------");

		name.chars().forEach(System.out::println);
		// name.chars().forEach(vl -> System.out.println(vl));

		System.out.println("--------------");

		name.chars().mapToObj(val -> (char) val).forEachOrdered(vl -> System.out.println(vl));

	}
}
