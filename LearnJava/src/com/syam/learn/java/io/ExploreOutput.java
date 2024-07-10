package com.syam.learn.java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ExploreOutput {

	public static void main(String[] args) {

		File myFile = new File("D:\\workspace\\jbe-jun24-fg\\LearnJava\\data\\learnings.txt");

		List<String> studentData = Arrays.asList("Syam Kakumani", "MCA", "PGP CAS, TN");

		try {
			FileWriter dataWrtiter = new FileWriter(myFile);

			for (int i = 0; i < studentData.size(); i++) {
				dataWrtiter.write(studentData.get(i) + "\n");
			}

			dataWrtiter.close();

		} catch (IOException e) {
			System.out.println("Unable to find the file ...");
		}

	}

}
