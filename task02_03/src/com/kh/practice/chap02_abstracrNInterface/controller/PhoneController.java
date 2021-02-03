package com.kh.practice.chap02_abstracrNInterface.controller;

import com.kh.practice.chap02_abstracrNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstracrNInterface.model.vo.V40;
import com.kh.practice.chap02_abstracrNInterface.model.vo.abstarctOne.SmartPhone;

public class PhoneController {
	private String[] stringresult = new String[2];
	
	
	
	public String[] method() {
		SmartPhone[] phone = new SmartPhone[2];
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		stringresult[0] =((GalaxyNote9) phone[0]).printInformation();
		stringresult[1] =((V40) phone[1]).printInformation();
		
		
		return stringresult;
	}

	public static void main(String[] args) {
		PhoneController ph = new PhoneController();
		ph.method();
	}
	
	
}
