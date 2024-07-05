package com.syam.learn.java.apie;

public class ExploreInheritance {

	public static void main(String[] args) {

		SavingBankAccount sbAccount = new SavingBankAccount();
		sbAccount.setName("Syam Kakumani");
		sbAccount.setContactNumber(111111);
		sbAccount.setMinimumBalance(1500);

		Greetings greets = new Greetings();
		greets.printGreetings();

		FestivalGreetings fvGreets = new FestivalGreetings();
		fvGreets.printGreetings();
		fvGreets.diwaliGreetings();
	}
}
