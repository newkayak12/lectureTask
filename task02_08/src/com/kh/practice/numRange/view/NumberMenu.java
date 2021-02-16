package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	Scanner scn = new Scanner(System.in);
	
	public void menu() {
			System.out.println("첫 번쨰 숫자 : ");
		int fir = scn.nextInt();
			System.out.println("두 번쨰 숫자 : ");
		int sec = scn.nextInt();
		try {
			System.out.print(fir + "은(는) " + sec + "의 배수인가?  : ");
			
			System.out.println(new NumberController().checkDouble(fir, sec));
		} catch (NumRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
