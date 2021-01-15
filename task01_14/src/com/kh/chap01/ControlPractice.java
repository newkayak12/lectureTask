package com.kh.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.println("1. 입력  2. 수정  3. 조회  4. 삭제 7. 종료");
			System.out.println("enter number : ");
		int num = sc.nextInt();
		if(num == 1) { 
			System.out.println("input menu");
		} else if( num == 2) {
			System.out.println("modification menu");
		} else if( num == 3) {
			System.out.println("inquiry menu");
		} else if( num == 4) {
			System.out.println("delete menu");
		} else if( num == 7) {
			System.out.println("program end");
		}
	}

	public void practice2() {
		System.out.println("enter any number");
	int number = sc.nextInt();
	if(number >0 ) {	
		if(number%2 ==0 ) {
				System.out.println("even number");
			} else {
				System.out.println("odd number");
			}
	} else {	
		System.out.println("please enter major number");
	}
	
	}

	public void practice3() {
			System.out.println("enter score of korean ");
		int kr = sc.nextInt();
			System.out.println("enter score of english ");
		int en = sc.nextInt();
			System.out.println("enter score of math ");
		int ma = sc.nextInt();
		
		int result = kr + en + ma;
		double avg = (double)result /3;
		
		if (( (kr>=40) && (en >= 40) && (ma >=40))&& avg>=60){
			System.out.println("korean : " + kr + "\n" + "math : " + ma + "\n" + "english : " + en + "\n" +"total : " + result + "\n" +"average : " + avg + "\n" );
			System.out.println("congratulation");
		} else {
			System.out.println("sorry");
		}
		
	}

	
	public void practice4( ) {
			System.out.println(" enter any Month : ");
		int season = sc.nextInt();
		
		
			switch(season)	{
				case 1 :
					System.out.println("winter");
							break;
				case 2 :
					System.out.println("winter");
						break;
				case 3 :
					System.out.println("Spring");
							break;
				case 4 :
					System.out.println("Spring");
							break;
				case 5 :
					System.out.println("Spring");
							break;
				case 6 : 
					System.out.println("summer");
							break;
				case 7 : 
					System.out.println("summer");
							break;
				case 8 : 
					System.out.println("summer");
							break;
				case 9 :
					System.out.println("fall");
							break;
				case 10 :
					System.out.println("fall");
							break;
							
				case 11 :
					System.out.println("winter");
							break;
				case 12:
					System.out.println("winter");
							break;
				default :
					System.out.println("it is not season");
					 		break;
			}
	}

	
	
	
	public void practice5 ( ) {
			System.out.println("enter id");
		String id = sc.next();
			System.out.println("enter password");
		String pss = sc.next();
		
			if((id.equals("newkayak12")&&(pss.equals("1234")))) {
				System.out.println("long in success");
			} else if((!id.equals("newkayak12")&&(pss.equals("1234")))) {
				System.out.println("wrong id");
			} else if((id.equals("newkayak12")&&(!pss.equals("1234")))) {
				System.out.println("wrong password");
			}
	}

	
	
	public void practice6( ) {
			System.out.println("1. 관리자 2. 회원 3. 비회원");
		int num = sc.nextInt();
			switch (num) {
				case 1:
					System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
					break;
				case 2: 
					System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
					break;
				default: 
					System.out.println("게시글 조회");
					break;
			}
		
	}
	
	public void practice7 ( ) {
			System.out.println("your height : ");
		double hei = sc.nextDouble();
			System.out.println("your weight : ");
		double wei = sc.nextDouble();
		
		double bmi = wei/ (hei*hei);
		
		if (bmi < 18.5 ) {
			System.out.println(bmi);
			System.out.println("저체중");
		} else if (bmi <23) {
			System.out.println(bmi);
			System.out.println("정상체중");
		} else if (bmi <25) {
			System.out.println(bmi);
			System.out.println("과체중");
		} else if (bmi <30) {
			System.out.println(bmi);
			System.out.println("비만");
		} else {
			System.out.println(bmi);
			System.out.println("고도 비만");
		}
	}
	
	public void practice8 ( ) {
			System.out.println("enter any number");
		int num1 = sc.nextInt();
			System.out.println("enter any operator");
		String op = sc.next();
			System.out.println("enter any number");
		int num2 = sc.nextInt();
		double result;
			if( (num1>0) && (num2>0) ) {
				if(op.equals("+")) {
					result = (double)num1 + num2;
					System.out.println(result);
				} else if (op.equals("-")) {
					result = (double)num1 - num2;
					System.out.println(result);
				} else if (op.equals("*")) {
					result = (double)num1 *num2;
					System.out.println(result);
				} else if (op.endsWith("/")) {
					result = (double)num1/num2;
					System.out.println(result);
				}
			} else {
				System.out.println("you enter wrong number program terminated");
			}
	
	
	}
	
	public void practice9 ( ) {
			System.out.println("score of midterm exam");
		int mid = sc.nextInt();
			System.out.println("score of fianl exam");
		int fi = sc.nextInt();
			System.out.println("score of task");
		int ta = sc.nextInt();
			System.out.println("days of attandance");
		int at= sc.nextInt();
		
		
		double result = (mid * 0.2) + (fi + 0.3) + (ta*0.3) + (at);
		
		if(result>=70&&at>14) {
			System.out.println("=======result=====");
			System.out.println("mid(20)" + (mid * 0.2)+ "\n" + "fin(30)" + (fi + 0.3) + "\n" + "task(30)" + (ta*0.3) + "\n"+ "attandance " +(double) at + "\n"+"total" + (double)result + "\n");
			System.out.println("pass");
		} else if((result<70&&at>14)) {
			System.out.println("mid(20)" + (mid * 0.2)+ "\n" + "fin(30)" + (fi + 0.3) + "\n" + "task(30)" + (ta*0.3) + "\n"+ "attandance" + (double)at + "\n"+"total" + (double)result + "\n");
			System.out.println("fail");
		} else  {
			System.out.println("fail _ attandace");
		}
	}
	
	public void pracitce10 ( ) {
			System.out.println("choose menu");
			System.out.println("1. 메뉴 출력 \n2. 짝수 홀수 \n3. 합격 불합격 \n4. 계절 \n5. 로그인 \n6. 권한 확인 \n7.BMI \n8.계산기 \n9.P/F \n10. 종료");
		int cho = sc.nextInt();
		boolean run  = true;
		do {
		switch (cho) {
			case 1:
				practice1();
				break;
			case 2:
				practice2();
				break;
			case 3:
				practice3();
				break;
			case 4:
				practice4();
				break;
			case 5:
				practice5();
				break;
			case 6:
				practice6();
				break;
			case 7:
				practice7();
				break;
			case 8:
				practice8();
				break;
			case 9:
				practice9();
				break;
			case 10:
				run =false;
				System.out.println("fin");
		}
		}while(run);
	}

	
	
}
