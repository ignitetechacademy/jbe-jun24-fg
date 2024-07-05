package com.syam.learn.java.loopz;

import java.util.Scanner;

public class ExploreControlStatements {

	public static void main(String[] args) {

		for (int j = 1; j <= 10; j++) {
			if (j % 2 == 0) {
				continue;
			}

			System.out.println(j);
		}

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the number to check : ");
		int inputNumber = scan.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

			if (i == inputNumber) {
				break;
			}
		}

	}
}
