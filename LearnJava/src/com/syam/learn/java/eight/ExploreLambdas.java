package com.syam.learn.java.eight;

public class ExploreLambdas {

	public static void main(String[] args) {
		CompanyInfo i = new CompanyInfo();
		i.info();

		PersonalInfo p = new PersonalInfo();
		p.info();

		Info familyInfo = new Info() {

			@Override
			public void info() {
				System.out.println("Kakumani Family - 5 members");
			}
		};
		familyInfo.info();
		
		Info educationInfo = () -> {
			System.out.println("Syam Kakumani - MCA");
		};
		educationInfo.info();

	}
}

interface Info {
	public abstract void info();
}

class CompanyInfo implements Info {

	@Override
	public void info() {
		System.out.println("Akshara Softwares - Bangalore");
	}

}

class PersonalInfo implements Info {

	@Override
	public void info() {
		System.out.println("Syam Kakumani - Bangalore");

	}

}
