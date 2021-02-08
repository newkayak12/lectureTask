package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	Scanner scn = new Scanner(System.in);
	public void menu() {
		System.out.println("문자열 : ");
	String input = scn.next();
	
	try {
		System.out.println("영문자는 : " + new CharacterController().countAplha(input)+ "개");
	} catch (CharCheckException e) {
		e.getMessage();
		e.printStackTrace();
	}
	}
	
}
