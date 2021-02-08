package com.kh.praactice.leap.view;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

import com.kh.praactice.leap.controller.LeapController;

public class LeapView {
	
	
	public LeapView() {
		LeapController lc = new LeapController();
		Scanner scn = new Scanner(System.in);
			System.out.println("윤년인지 검색할 년도를 입력하세요");
		int search = scn.nextInt();
		if(lc.isLeapYear(search)) {
			System.out.println("이번 년도는 윤년");
		}  else {
			System.out.println("이번 년도는 평년");
		}
		
		
		
		System.out.println(lc.leapDate(Calendar.getInstance())+ "일 지남 (2021년 1월 1일에서부터) ");
		
		
	}
}
