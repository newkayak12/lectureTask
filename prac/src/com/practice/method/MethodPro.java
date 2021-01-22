package com.practice.method;

import java.util.Scanner;

public class MethodPro {
	Scanner scn = new Scanner(System.in);

	
	public String practice01(String str, String str2) {
		System.out.println(str+str2);
		return str+str2;
		
	}
	
	public int practice02(int val1, int val2) {
		int result =0;
		if(val1<val2) {
			for(int i = val1; i<=val2; i++ ) {
				result +=i;
				
			}
			System.out.println(result);
			return result;
		} else {
			System.out.println("첫번째 수가 커야합니다.");
			return 0;
		}
			
		
	}
	
	public boolean practice03(char ch) {
//		if((ch>=65 && ch<=90) ||(ch>=97&&ch<=122)) {
		if((ch>='A' && ch<='Z') ||(ch>='a'&&ch<='z')) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}
	
	
	public boolean practice04(char ch1, char ch2) {
		if(ch1==ch2) {
			System.out.println("true");
			return true;
		}
		else {
			System.out.println("false");
			return false;
		}
	}
	
	
	public boolean practice04re(String input1, String input2) {
		return input1.equals(input2);
	}
	
//	더 간단하게 만들 수 있는 방향으로 가야한다.
	
	
	String id = "newkayak12";
	String password = "1234";
//	로그인 처리 구현하기
	public boolean login(String id, String password) {
		
		
		if(this.id.equals(id)&&this.password.equals(password)){
			System.out.println("log in success");
			return true;
//		} else if((!this.id.equals(id)&&this.password.equals(password))||(this.id.equals(id)&&!this.password.equals(password)))  {
//			System.out.println("log in failure");
//			return false; }
		} else {
			System.out.println("fail");
			return false;
		}
		
	}	
		
		
	
	
	public boolean checkLogin(String id , String password) {
		if(id.length()<4 || password.length()<4) {
			return false;
		}
		return id.equals("admin")&&password.equals("1234");
		
//		return을 만나면 메소드는 거기까지만 하고 그 밑으로는 읽지 않는다. 
	}
	
	public void returnTest(int su) {
		if(su<10) {
			return;
		}
		System.out.println("void에서 return은??");
	}
	
	
	
	
	

}
