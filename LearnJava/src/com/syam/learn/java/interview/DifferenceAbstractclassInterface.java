package com.syam.learn.java.interview;

import java.io.Serializable;

public class DifferenceAbstractclassInterface {

	public static void main(String[] args) {
		// LoadData ld = new LoadData();

		LoadInternalData iData = new LoadInternalData();
		iData.loadCompanyData();
		iData.loadCountryData();
		
		Serializable s;
	}
}

interface FetchData {
	
	int total = 100;

	public abstract String fetchEmployeeData();
	String fetchStateData();
}

abstract class LoadData {
	abstract String loadCountryData();

	String loadCompanyData() {
		return "Akshara Softwares";
	}
}

class LoadInternalData extends LoadData {

	@Override
	String loadCountryData() {
		return "India";
	}
}