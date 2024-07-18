package com.syam.learn.java.arrayz;

public class ExploreJaggedArray {

	public static void main(String[] args) {

		String[][] stateCapitals = new String[3][];

		stateCapitals[0] = new String[3];
		stateCapitals[1] = new String[1];
		stateCapitals[2] = new String[1];
		
		stateCapitals[0][0] = "Amaravati";
		stateCapitals[0][1] = "Kurnool";
		stateCapitals[0][2] = "Vizag";

		stateCapitals[1][0] = "Chennai";
		
		stateCapitals[2][0] = "Bangalore";
		stateCapitals[2][1] = "Belagavi";
		
		System.out.println(stateCapitals[0][1]);
		
	}
}
