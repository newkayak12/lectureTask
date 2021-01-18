package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner scn= new Scanner(System.in);
	public void practice11() {
			System.out.println("4자리 수의 비밀번호를 입력해주세요");
		String pss= scn.next();
		boolean pass = true;
		if(pss.length()>4||pss.length()<4) {
			System.out.println("자리 수 안 맞음");
		}else {
			for(int i=0; i<4; i++) {
				for(int j=0; j<4; j++) {
					if(i!=j&&(pss.charAt(i)==pss.charAt(j))) {
						pass=false;
						break;
					} else {
						pass=true;
						break;
					}
				}
			}
		}
		
		if(pass==true) {
			System.out.println("생성 성공");
		} else {
			System.out.println("중복값 있음");
		}
	}
}
