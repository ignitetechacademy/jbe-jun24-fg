package com.syam.learn.java.loopz;

import java.util.Iterator;

public class ExploreLoopsExtn {

	public static void main(String[] args) {
		
		for (int i = 11; i <= 15; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		
//		for (int i = 15; i >= 11; i--) {
//			System.out.println(i);
//		}
		
		int i = 15;
		for (; i >= 11;) {
			System.out.println(i);
			 i--;
		}
		
	}
}
