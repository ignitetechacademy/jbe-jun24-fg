package com.syam.learn.java.methodz;

public class ExploreMethods {

	public static void main(String[] args) {
		FewMethods me = new FewMethods();
		
		me.printName();
		me.doubleValue(10);
		
		String currentTime = me.getTime();
		System.out.println(currentTime);
		
		int total = me.addition(12, 36);
		System.out.println(total);
	}
}
