package com.syam.learn.java.collectionz;

import java.util.ArrayList;
import java.util.List;

public class ExploreList {

	public static void main(String[] args) {

		int[] studentsMarks = new int[3];
		studentsMarks[0] = 74;
		studentsMarks[1] = 85;
		studentsMarks[2] = 99;
		studentsMarks[3] = 69;
		System.out.println(studentsMarks.length);

		List<Integer> marksList = new ArrayList<>();
		marksList.add(74);
		marksList.add(85);
		marksList.add(99);
		marksList.add(69);
		marksList.add(88);
		System.out.println(marksList.size());
	}
}
