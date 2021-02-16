package com.kh.praactice.token.view;

import java.util.Scanner;

import com.kh.praactice.token.controller.TokenController;

public class TokenMenu {
	private Scanner scn = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 문자열");
		System.out.println("3. 프로그램 끝내기");
		
		System.out.print(">");
		int input = scn.nextInt();
			switch(input) {
			 	case 1:
			 			tokenMenu();
			 			break;
			 	case 2: 
			 			inputMenu();
			 			break;
			 	case 3: 
			 			return;
	 			default : 
	 				System.out.println("잘못 입력하였습니다.");
	 					break;
			}
	}
	
	public void tokenMenu() {
		System.out.println("enter any voca");
		scn.nextLine();
		String str = scn.nextLine();
		
			System.out.println("토큰 처리 전 글자 : ");
			System.out.println(str);
			System.out.println("토큰 처리 전 글자 수 : ");
			System.out.println(str.length());
			System.out.println("토큰 처리 후 글자 : ");
			System.out.println(tc.afterToken(str));;
			System.out.println("토큰 처리 후 글자 수 : ");
			System.out.println(tc.afterToken(str).length());
			System.out.println(tc.afterToken(str).toUpperCase());
	}
	public void inputMenu() {
			System.out.println("첫 글자 대문자 : ");
		String str = scn.next();
			System.out.println(tc.firstCap(str));
			System.out.println("찾을 문자 : ");
		char search = scn.next().charAt(0);
			System.out.println(tc.findChar(str, search));
		
			
	}
}
