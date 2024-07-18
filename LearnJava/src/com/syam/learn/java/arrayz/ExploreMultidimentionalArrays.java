package com.syam.learn.java.arrayz;

public class ExploreMultidimentionalArrays {

	public static void main(String[] args) {

		int[][] allMarks = new int[3][4];

		allMarks[0][0] = 66;
		allMarks[0][1] = 99;
		allMarks[0][2] = 44;
		allMarks[0][3] = 77;

		allMarks[1][0] = 77;
		allMarks[1][1] = 88;
		allMarks[1][2] = 55;
		allMarks[1][3] = 66;

		allMarks[2][0] = 88;
		allMarks[2][1] = 77;
		allMarks[2][2] = 66;
		allMarks[2][3] = 55;

		System.out.println("3rd year - Science Marks " + allMarks[2][1]);
		System.out.println("1st year - Marks Marks " + allMarks[0][2]);

		for (int[] is : allMarks) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println("\n");
		}

	}
}
