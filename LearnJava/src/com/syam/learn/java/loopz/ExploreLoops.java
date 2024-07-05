package com.syam.learn.java.loopz;

public class ExploreLoops {

	public static void main(String[] args) {
		
		// for loop
		// for (  initialization  -  condition   - increment or decrement                   ) {}
		
		int numberCount = 4;
		
		for (int i = 1; i < numberCount; i++) {
			System.out.println("Number : "+ i);
		}
		
		int i = 1;
		for ( ; i < numberCount ; ) {
			System.out.println("New Number : "+ i);
			i++;
		}
		
		int value = 10;
		while(value < 50) {
			System.out.println(value);
			value = value + 10;
		}

	}

}
