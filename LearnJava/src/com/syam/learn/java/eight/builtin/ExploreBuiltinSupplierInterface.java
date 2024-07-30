package com.syam.learn.java.eight.builtin;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;

public class ExploreBuiltinSupplierInterface {

	public static void main(String[] args) {
		DateRetrieverImpl dateImpl = new DateRetrieverImpl();
		System.out.println(dateImpl);
		System.out.println("Named Class : " + dateImpl.todayDate());
		System.out.println("-------------------");

		DateRetriever dateAnonymous = new DateRetriever() {
			@Override
			public String todayDate() {
				return LocalDate.now().toString();
			}
		};
		System.out.println(dateAnonymous);
		System.out.println("Anonymous Class : " + dateAnonymous.todayDate());
		System.out.println("--------------------");

		DateRetriever dateLambda = () -> {
			return LocalDate.now().toString();
		};
		System.out.println(dateLambda);
		System.out.println("Lambda Expr : " + dateLambda.todayDate());
		System.out.println("---------------------");

		Supplier<String> dateInbuilt = () -> {
			return LocalDate.now().toString();
		};
		System.out.println(dateInbuilt);
		System.out.println("Supplier Impl : " + dateInbuilt.get());
	}
}

interface DateRetriever {
	String todayDate();
}

class DateRetrieverImpl implements DateRetriever {

	@Override
	public String todayDate() {
		return LocalDate.now().toString();
	}

}