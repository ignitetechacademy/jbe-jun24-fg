package com.syam.learn.java.collectionz;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		Set<String> students = new HashSet<>();
		students.add("Syam");
		students.add("Girish");
		students.add("Krishna");
		students.add("Syam");
		students.add("Tarun");
		System.out.println("HashSet Values : " + students);

		students = new TreeSet<>();
		students.add("Syam");
		students.add("Girish");
		students.add("Krishna");
		students.add("Syam");
		students.add("Tarun");
		System.out.println("TreeSet Values : " + students);
	}
}
