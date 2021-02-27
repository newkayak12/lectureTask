package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner scn = new Scanner(System.in);
	
	public void mainMenu()	{
			System.out.print("   name : ");
		String name = scn.next();
			System.out.print("   age  : ");
		int age = scn.nextInt();
			System.out.print(" gender : ");
		char gender = scn.next().charAt(0);
		lc.insertMemeber(new Member(name, age, gender));
		
		while(true) {	
			System.out.println("  	menu");
			System.out.println("  	1. mypage");
			System.out.println("  	2. inquary all");
			System.out.println("  	3. search");
			System.out.println("  	4. rent");
			System.out.println("  	9. quit");		
			
			System.out.print(" > ");
			
			int input = scn.nextInt();
				switch(input) {
					 case 1: System.out.println(lc.myinfo());
					 			break;
					 case 2: selectAll();
					 			break;
					 case 3: searchBook();
					 			break;
					 case 4: rentBook();
					 			break;
					 case 9:
						 System.out.println("terminated");
						 return;
				}
		}		
	}
	
	
	public void selectAll() {
		for(int i =0; i<lc.getbList().length; i++	) {
			System.out.println((i+1)+ "번 도서" + lc.selectAll()[i]);
			
		}
		
	}
	
	public void searchBook() {
			System.out.print("enter Keyword :");
		String search = scn.next();
		
			System.out.println("result : ");
			
			for(int i=0; i</*lc.getCount()*/5; i++) {
				if(lc.searchBook(search)[i]!=null) {
					System.out.println(lc.searchBook(search)[i]);
				}
			}
		
	}
	
	public void rentBook() {
			selectAll();
			System.out.println("enter index of book ");
		int enter = scn.nextInt();	
		switch (lc.rentBook(enter)) {
		
			case 0: 
				System.out.println("rental completed");
				break;
			case 1: 
				System.out.println("you can't rent this book sorry \n reason : your age");
				break;
			case 2: 
				System.out.println("retal completed and coupon and you received coupon ");
		}	
	}
}
