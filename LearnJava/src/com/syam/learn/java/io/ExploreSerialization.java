package com.syam.learn.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ExploreSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 write();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("college.obj"));
		College retrievedcollege = (College) ois.readObject();
		System.out.println("Read from File : " + retrievedcollege);

	}

	static void write() throws IOException {
		College clg = new College("SVCET", "Ravuri Venkata Swamy", "Chittor");
		System.out.println(clg);

		FileOutputStream fos = new FileOutputStream("college.obj");
		ObjectOutputStream oop = new ObjectOutputStream(fos);
		oop.writeObject(clg);
	}
}

class College implements Serializable {
	String name;
	String founder;
	transient String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public College(String name, String founder, String location) {
		super();
		this.name = name;
		this.founder = founder;
		this.location = location;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", founder=" + founder + ", location=" + location + "]";
	}

}
