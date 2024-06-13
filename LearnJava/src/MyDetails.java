import java.util.Scanner;

public class MyDetails {

	public static void main(String[] args) {

		/*
		 * String name = "Syam"; int percentage = 75; boolean passed = true;
		 */

//		String name = args[0];
//		String percentage = args[1];
//		String passed = args[2];
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = scan.next();
		
		System.out.println("Enter percentage : ");
		String percentage = scan.next();
		
		System.out.println("Enter status : ");
		String passed = scan.next();

		System.out
				.println("My name is " + name + " - My percentage is " + percentage + "% - I cleared exams " + passed);
	}

}
