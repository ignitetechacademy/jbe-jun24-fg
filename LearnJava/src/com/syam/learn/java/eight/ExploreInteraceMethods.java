package com.syam.learn.java.eight;

public class ExploreInteraceMethods {

	public static void main(String[] args) {
		Process p = () -> {
			System.out.println("ExploreInteraceMethods.main()");
		};
		p.processInfo();
		
		p.data();
		
		Process.info();
	}
}

@FunctionalInterface
interface Process {

	void processInfo();

	static void info() {
		System.out.println("I'm a static methos in the Process interface");
	}

	default void data() {
		System.out.println("I'm a default method in the Process Interface");
	}
}
