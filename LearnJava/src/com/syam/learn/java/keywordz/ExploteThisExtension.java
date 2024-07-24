package com.syam.learn.java.keywordz;

public class ExploteThisExtension {

	public static void main(String[] args) {
		City c = new City();
		// c.setCityName("Bangalore");
		c.setName("Bangalore");
		System.out.println(c);
	}

}

class City {
	String name;

//	void setCityName(String name){
//		name = name;
//	}

	@Override
	public String toString() {
		return "City [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

}
