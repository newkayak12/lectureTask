package com.kh.practice.chap02_abstracrNInterface.model.vo.interfaces;

public interface Phone {
	public static final char[] NUMBERPAD = {'1','2','3','4','5','6','7','8','9','*','0','#'};
	
	public String makeCall();
	
	public String takeCall();
}
