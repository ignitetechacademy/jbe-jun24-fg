package com.syam.learn.java.eight.builtin;

import java.util.function.Predicate;

public class ExploreInbuiltPredicateInterface {

	public static void main(String[] args) {

		Predicate<Integer> isEven = num -> {
			return num % 2 == 0;
		};
		System.out.println(isEven.test(10));

	}
}
