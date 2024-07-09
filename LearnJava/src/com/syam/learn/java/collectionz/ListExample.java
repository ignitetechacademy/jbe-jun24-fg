package com.syam.learn.java.collectionz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<Integer>();
		marks.add(55);
		marks.add(69);
		marks.add(94);
		marks.add(63);
		System.out.println(marks);

		marks = new LinkedList<>();
		marks.add(44);
		marks.add(85);
		marks.add(99);
		marks.add(71);
		System.out.println(marks);

	}
}
