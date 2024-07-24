package com.syam.learn.java.threadz;

public class ExploreThreads {

	public static void main(String[] args) {
		System.out.println("Explore Threads : " + Thread.currentThread().getName());

		Greetings gr = new Greetings();
		gr.start();
		// gr.start();
		
		Greetings gr2 = new Greetings();
		gr2.start();
		
		Greetings gr3 = new Greetings();
		gr3.start();
	}
}

class Greetings extends Thread {
	@Override
	public void run() {
		System.out.println("Greetings : " + Thread.currentThread().getName());

		System.out.println("Monsoon Greetings !!");
	}
}
