package com.kh.praactice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		// TODO Auto-generated constructor stub
	}
	
	public String afterToken(String str) {
		//공백을 토큰으로 처리한 문자열 반환
		StringTokenizer token = new StringTokenizer(str, " ");
		String result = "";
		int count = token.countTokens();
			for(int i=0; i<count; i++) {
				result += token.nextToken();
				
			}
		return result;
	}
	
	public String firstCap(String input) {
//		첫 글자만 대문자로 바꾼 문자열 반환
		String temp = input.substring(0, 1);
		temp = temp.toUpperCase();
		String result = temp.concat(input.substring(1, input.length()));
		
		
		
		return result;
	}
	
	public int findChar(String input, char one) {
//		문자열 안에 찾을 문자 개수가 몇 개 들어가 있는지 반환
		int count = 0;
		Character ch = one;
		String search = ch.toString();
			for(int i =0; i<input.length(); i++) {
				if(input.contains(search)) {
					char[] temp = new char[input.length()];
						temp[i] = input.charAt(i);
						if(temp[i] == one) {
							count++;
						}
				}
				
			}
		return count;
	}
}
