package com.syam.learn.java.threadz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExploreThreadExtension {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		List<Integer> salaries = Arrays.asList(1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000);
		int halfListSize = salaries.size() / 2;

		List<Integer> salariesFirstHalf = salaries.subList(0, halfListSize);
		System.out.println(salariesFirstHalf);
		List<Integer> salariesSecondHalf = salaries.subList(halfListSize, salaries.size());
		System.out.println(salariesSecondHalf);

		Payroll p = new Payroll(salariesFirstHalf);
		p.start();

		Payroll p2 = new Payroll(salariesSecondHalf);
		p2.start();

		System.out.println("Thread ccreation completed ..");
	}
}

class Payroll extends Thread {
	List<Integer> salariesList;

	public Payroll(List<Integer> salariesList) {
		super();
		this.salariesList = salariesList;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (Integer salary : salariesList) {
			System.out.println(Thread.currentThread().getName() + " - " + (salary + (salary * 10 / 100)));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
