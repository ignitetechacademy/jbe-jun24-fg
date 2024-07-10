package com.syam.learn.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExploreInput {

	// in this class, I'm reading a file - printing the data & using the parent
	// Exception

	public static void main(String[] args) {

		File myFile = new File("D:\\workspace\\jbe-jun24-fg\\LearnJava\\data\\education.txt");

		try {
			FileReader fileInfoReader = new FileReader(myFile);

			int readChar;
			while ((readChar = fileInfoReader.read()) != -1) {
				System.out.println((char) readChar + " - " + readChar);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File is not there ...");
		} catch (IOException e) {
			System.out.println("You don't have permission to read the file ");
		}

		System.out.println("Program completed ...");
	}
}
