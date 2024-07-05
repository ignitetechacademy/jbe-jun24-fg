package com.syam.learn.java.apie;

public class InheritanceChallenge {

	public static void main(String[] args) {
		Child syam = new Child();
		syam.getCar();
	}
}

class Child extends Mom{
	
}

class Mom{
	void getCar() {
		System.out.println("Mom's car !!");
	}
}


class Dad{
	void getCar() {
		System.out.println("Dad's car !!");
	}
}
