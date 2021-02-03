package com.kh.practice.chap02_abstracrNInterface.model.vo.abstarctOne;

import com.kh.practice.chap02_abstracrNInterface.model.vo.interfaces.Cellphone;
import com.kh.practice.chap02_abstracrNInterface.model.vo.interfaces.TouchDisplay;

public abstract class SmartPhone implements Cellphone, TouchDisplay {

	private String maker;
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public abstract String printInformation();
}
