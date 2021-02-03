package com.kh.practice.chap02_abstracrNInterface.run;

import com.kh.practice.chap02_abstracrNInterface.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
		PhoneController phoncontroller = new PhoneController();
		
		
		for(String phone : phoncontroller.method()) {
			System.out.println(phone);
		}
		
//		for( int i=0; i<2; i++) {
//			System.out.println(phoncontroller.method()[i]);
//		}
	}
}
