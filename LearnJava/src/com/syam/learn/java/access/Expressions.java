package com.syam.learn.java.access;

public class Expressions {

	
	public void happy(){
		System.out.println("Smiling ...");
	}
	
	protected void sad(){
		System.out.println("Crying ...");
		
		Expressions e = new Expressions();
		e.surprise();
	}
	
	void sleepy(){
		System.out.println("Yawning ...");
	}
	
	private void surprise(){
		System.out.println("!!!!!!!!!!");
	}
}
