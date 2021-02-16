package com.kh.praactice.leap.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		LocalDate thisyear = LocalDate.of(year, 1, 1);
		
		boolean leap = thisyear.isLeapYear();
		
		return leap;
	}
	
	public long leapDate(Calendar c) {
		
		LocalDate thisyear = LocalDate.now();
		LocalDate target = LocalDate.of(2021, 1, 1);
		long btwn = target.until(thisyear, ChronoUnit.DAYS);
		
//		진짜 이건 캘린더로 어떻게 해야하는지 모르겠다...
		
		
		
		
		return btwn;
	}
	
}
