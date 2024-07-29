package com.syam.learn.java.keywordz;

public class ExploreThisAdditionalReference {

	public static void main(String[] args) {
		OperatingSystem windows = new OperatingSystem();
		System.out.println(windows);
		
		String winOS = "Windows Operating system";
		windows.useOSName(winOS);
		System.out.println(windows);
	}
}

class OperatingSystem {
	String name;
	int introducedYear;

	@Override
	public String toString() {
		return "OperatingSystem [name=" + name + ", introducedYear=" + introducedYear + "]";
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	
//	void useOSName(String nameOfTheOS) {
//		name = nameOfTheOS;
//	}

	void useOSName(String name) {
		this.name = name;
	}
	
	

}
