package com.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestLocalDateTime {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current date : "+currentDate);
		LocalDate someOtherDate = LocalDate.parse("2019-10-14");
		System.out.println("Another Date : "+someOtherDate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate anotherDate = LocalDate.parse("16-12-2018", formatter);
		System.out.println("Another Date : "+anotherDate);
		System.out.println("Date in another format : "+anotherDate.format(formatter));
		
		LocalTime time = LocalTime.now();
		System.out.println("Time : "+time);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println("Time : "+time.format(formatter1));
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Date and time : "+dateTime);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("");
		
	}

}
