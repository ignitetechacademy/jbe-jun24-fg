package com.syam.learn.java.exceptionz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExplorecompiletimeExceptions {

	public static void main(String[] args) {

		File myFile = new File("D:\\workspace\\jbe-jun24-fg\\LearnJava\\data\\personal.txt");

		try {
			FileReader fileInfoReader = new FileReader(myFile);
			
			int readChar;
			while( (readChar =fileInfoReader.read()) != -1) {
				System.out.println((char) readChar);
			}
			
		} catch (IOException e) {
			System.out.println("File is not there ...");
		}
		
		System.out.println("Program completed ...");
	}
}
