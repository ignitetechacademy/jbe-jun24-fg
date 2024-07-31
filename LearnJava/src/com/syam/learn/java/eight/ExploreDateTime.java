package com.syam.learn.java.eight;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExploreDateTime {

	public static void main(String[] args) {
		System.out.println(LocalTime.now());
		System.out.println(LocalDate.now());
		
		System.out.println(LocalDateTime.now());
		
		LocalDateTime ldt = LocalDateTime.now();
		String formattedDate = ldt.format(DateTimeFormatter.ofPattern("dd/MM/yy"));
		System.out.println(formattedDate);
		
		System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy")));
		System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd/mm/yyyy")));
	}
}
