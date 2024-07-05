package com.syam.learn.java.loopz;

import java.util.Scanner;

public class ExploreSwitchStatement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Day : ");
		String day = scan.nextLine();
		
		switch (day) {
		case "Monday": {
			System.out.println("Working day");
			break;
		}
		
		case "Tuesday": {
			System.out.println("Working day");
			break;
		}
		
		case "Saturday": {
			System.out.println("Holi day");
			break;
		}
		
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
		
	}
}
