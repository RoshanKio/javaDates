package com.takeo;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Today is "+date+"\n================\n"+"Year : \t"+date.getYear()+"\nMonth : \t"+date.getMonth()+"\nday of the Month : \t"+date.getDayOfMonth()+"\nday of the Week : \t"+date.getDayOfWeek());
	}

}
