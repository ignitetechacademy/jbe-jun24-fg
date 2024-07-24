package com.syam.learn.java.threadz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExploreThreadExtension {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		List<Integer> salaries = Arrays.asList(1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000);

		Payroll p = new Payroll(salaries);
		p.start();

		Payroll p2 = new Payroll(salaries);
		p2.start();
		
		Payroll p3 = new Payroll(salaries);

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

		synchronized (salariesList) {

			for (Integer salary : salariesList) {
				System.out.println(Thread.currentThread().getName() + " - " + (salary + (salary * 10 / 100)));

				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
