package com.syam.learn.java.constructors;

public class ConstructorsExplained {

	public static void main(String[] args) {
		
		College pgpCollege = new College();
		pgpCollege.setName("PGP College");
		pgpCollege.setUniversity("Periyar University");
		
		System.out.println(pgpCollege);
		
		College iiitIdupulapaya = new College("IIIT Idupulapaya", "Rajiv Gandhi University Knowledge Technology");
		System.out.println(iiitIdupulapaya);
		
		College iiitIdl = new College();
		iiitIdl.setName("IIIT Idupulapaya");
		iiitIdl.setUniversity("Rajiv Gandhi University Knowledge Technology");
		System.out.println(iiitIdl);
	}
}
