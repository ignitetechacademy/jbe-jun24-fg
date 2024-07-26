package com.syam.learn.java.conceptz;

public class ExplorePassByReference {

	public static void main(String[] args) {

		Values vs = new Values(10, 20);
		System.out.println("Before : " + vs.getValueOne());

		SimpleCalculations calc = new SimpleCalculations();
		calc.addition(vs);
		System.out.println("After : " + vs.getValueOne());
	}
}

class SimpleCalculations {

	int addition(Values vals) {
		int sum = vals.getValueOne() + vals.getValueTwo();
		vals.setValueOne(300);

		return sum;
	}
}

class Values {
	int valueOne;
	int valueTwo;

	public int getValueOne() {
		return valueOne;
	}

	public void setValueOne(int valueOne) {
		this.valueOne = valueOne;
	}

	public int getValueTwo() {
		return valueTwo;
	}

	public void setValueTwo(int valueTwo) {
		this.valueTwo = valueTwo;
	}

	public Values(int valueOne, int valueTwo) {
		super();
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}

}
