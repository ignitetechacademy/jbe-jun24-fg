package com.syam.learn.java.variables;

public class Wrappers {

	public static void main(String[] args) {

		byte b;
		short s;
		int i;
		long l;

		float f;
		double d;

		char c;
		boolean bl;
		
		int departments = 5;
		byte totalDepartments = (byte) departments ;
		
		
		Integer modules = 6;
		byte totalModules = modules.byteValue() ;
		
		
		Integer sales = 250000; // internally  compiler will change this to Integer totalSales = new Integer(250000);
		Integer totalSales = new Integer(250000);

		
		Byte bb;
		Short ss;
		Integer ii;
		Long ll;

		Float ff;
		Double dd;

		Character cc;
		Boolean blbl;
	}

}
