package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {
		// TODO Auto-generated constructor stub
	}
	
	public int countAplha (String s) throws CharCheckException{
		char[] ch = new char[s.length()];
		s.getChars(0, s.length(), ch, 0);
		int count = 0;
			for(char check : ch) {
				if(check!=' ') {
					if( (check>=65&&check<=90) || (check>=97&&check<=122)) {
						count++;
					}
				} else {
					throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
				}
				
			}
		return count; 
	}
}
