package com.practice.run;

import java.util.Scanner;

import com.practice.method.MethodPro;

public class Run {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		MethodPro mp = new MethodPro();
//			System.out.println("no.1");
//		mp.practice01("java", "programming");
//			System.out.println("\n no.2 2:4");
//		mp.practice02(2, 4);
//			System.out.println("\n no.2-2 7:2");
//		mp.practice02(7, 2);
//			System.out.println("\n no.3 A");
//		mp.practice03('A');
//			System.out.println("\n no.3-2 *");
//		mp.practice03('*');
//			System.out.println("\n no.4 A:Z");
//		mp.practice04('A', 'Z');
//			System.out.println("\n no.4-2 A:A");
//			System.out.println("enter character");
//		char input1 = scn.next().charAt(0);
//			System.out.println("enter character");
//		char input2 = scn.next().charAt(0);
//		
//		mp.practice04(input1, input2);
//		
//		
//		System.out.println("\n no.4-3 A:A");
//		System.out.println("enter character");
//	String input3 = scn.next();
//		System.out.println("enter character");
//	String input4 = scn.next();
//	
//	System.out.println((mp.practice04re(input3, input4))? "같다.": "아니다.");
	
		mp.login("newkayak12","1322");
		System.out.println("id :");
		String id = scn.next();
		System.out.println("password : ");
		String password = scn.next();
		System.out.println(mp.checkLogin(id, password)? "login success" : "failure");
		
//		return 은 메소드를 거기까지만 읽으며, 거기서 멈추게 한다. void일지라도
		
		mp.returnTest(20);
	}

}
