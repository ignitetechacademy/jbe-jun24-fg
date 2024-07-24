package com.syam.learn.java.threadz;

public class ExploreRunnable {

	public static void main(String[] args) {
		System.out.println("Explore Runnable : " + Thread.currentThread().getName());

		
		Welcome wel = new Welcome();
		Thread welcomeThread = new Thread(wel);
		welcomeThread.start();
		
		Thread welcomeThread2 = new Thread(wel);
		welcomeThread2.start();
		
		Thread welcomeThread3 = new Thread(wel);
		welcomeThread3.start();
	}
}


class Welcome implements Runnable{

	@Override
	public void run() {
		System.out.println("Welcome : " + Thread.currentThread().getName());

		System.out.println("Hello World !!");
	}
	
}
