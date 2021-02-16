package com.kh.practice.book.view;

import java.time.LocalDate;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner scn = new Scanner(System.in);
	private BookController bc = new BookController();
	Book[] bArr;
	
	public BookMenu() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void mainMenu()	{
		
		while(true) {
			System.out.println(" 1. 도서 추가 저장");
			System.out.println(" 2. 저장 도서 출력");
			System.out.println(" 9. 프로그램 끝내기 ");
			System.out.print(">");
		int input = scn.nextInt();
			switch(input){
				case 1: 
					fileSave();
					break;
				case 2:
					fileRead();
					break;
					
				case 9: 
					System.out.println("terminated");
					return; 
					
				default : 
					System.out.println("잘못 입력하였습니다.");
			}
		
		}
	}
	
	public void fileSave() {
		bc.makeFile();
		scn.nextLine();
			System.out.println(" title : ");
		String title = scn.nextLine();	
			System.out.println(" author : ");
		String author = scn.next();
			System.out.println(" price : ");
		int price = scn.nextInt();
			System.out.println(" publishing date (yyyy-mm-dd) : ");
		String date = scn.next();
			System.out.println(" discount rate : ");
		double discount = scn.nextDouble();
		
		
		String[] temp = date.split("-");
		Integer y=0;
		Integer m=0;
		Integer d=0;
		
//		Calendar s = new GregorianCalendar((int)y.parseInt(temp[0]),(int) m.parseInt(temp[1]),(int) d.parseInt(temp[2]));
		LocalDate ld = LocalDate.of(y.parseInt(temp[0]), m.parseInt(temp[1]), d.parseInt(temp[2]));
		
		bArr = new Book[1];
		
		Book s1 = new Book(title, author, price, ld, discount);
		bArr[0] = s1; 
		bc.fileSave(bArr);
		
	}
	
	
	
	
	public void fileRead() {
		for(int i=0; i<10; i++) {
			if(bc.fileRead()[i] != null) {
//				System.out.println("title : "+bc.fileRead()[i].getTitle());
//				System.out.println("author : "+bc.fileRead()[i].getAuthor());
//				System.out.println("price : "+bc.fileRead()[i].getPrice());
//				System.out.println("date : "+bc.fileRead()[i].getDate());
//				System.out.println("discount rate : "+bc.fileRead()[i].getDiscount());
				
				System.out.println(bc.fileRead()[i]);
				
				
			}
		}
	}
	
	
	
}
