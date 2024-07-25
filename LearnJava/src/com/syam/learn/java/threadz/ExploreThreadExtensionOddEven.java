package com.syam.learn.java.threadz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExploreThreadExtensionOddEven {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		List<Integer> salaries = Arrays.asList(1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000);

		EmpPayroll p = new EmpPayroll(salaries, 0);
		p.setName("giri");
		p.start();

		EmpPayroll p2 = new EmpPayroll(salaries, 1);
		p2.setName("krish");
		p2.start();

		System.out.println("Thread ccreation completed ..");
	}
}

class EmpPayroll extends Thread {
	List<Integer> salariesList;
	int index;

	public EmpPayroll(List<Integer> salariesList, int index) {
		super();
		this.salariesList = salariesList;
		this.index = index;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = index; i < salariesList.size(); i = i + 2) {

			// for (Integer salary : salariesList) {
			int salary = salariesList.get(i);
			System.out.println(Thread.currentThread().getName() + " - " + (salary + (salary * 10 / 100)));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
