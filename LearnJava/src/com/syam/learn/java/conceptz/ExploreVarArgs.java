package com.syam.learn.java.conceptz;

public class ExploreVarArgs {

	public static void main(String[] args) {
		Summation sumt = new Summation();
		sumt.add(10, 30);
		sumt.add(10, 30, 50);
		sumt.add(10, 30, 50, 90, 50);
		sumt.add();
	}

}

class Summation {
	
	int add(int... values){
		int total = 0;
		
		for (int i = 0; i < values.length; i++) {
			total = total + values[i];
		}
		
		System.out.println(total);
		return total;
	}

//	int add(int firstNum, int secondNum) {
//		return firstNum + secondNum;
//	}
//
//	public int add(int i, int j, int k) {
//		return i + j + k;
//
//	}

}
