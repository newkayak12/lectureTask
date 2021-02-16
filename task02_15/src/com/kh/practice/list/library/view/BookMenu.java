package com.kh.practice.list.library.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	Scanner scn = new Scanner(System.in);
	BookController bc = new BookController();
	
	public BookMenu() {
		// TODO Auto-generated constructor stub
	}
	
		public void mainMenu() {
			while(true) {
					System.out.println("******** Main ********");
					System.out.println("   1. add new book");
					System.out.println("   2. show all books");
					System.out.println("   3. search books");
					System.out.println("   4. delete book");
					System.out.println("   5. sort by book Name");
					System.out.println("   9.  terminate");
				int input = scn.nextInt();
				
				
					switch(input) {
						case 1: 
							insertBook();
							break;
						case 2: 
							selectList();
							break;
						case 3: 
							searchBook();
							break;
						case 4: 
							deleteBook();
							break;
						case 5: 
							ascBook();
							break;
						case 9: 
							System.out.println("terminated");
							return;
						default : 
							System.out.println("잘못 입력하였습니다.");
					}
			}	
			
	}

	private void insertBook() {
			System.out.println("title : ");
		String title = scn.next();
			System.out.println("author : ");
		String author = scn.next();
			System.out.println("category  1.인문 / 2. 자연과학/ 3. 의료/ 4. 기타");
		int input = scn.nextInt();
			System.out.println("price : ");
		int price = scn.nextInt();
			switch(input) {
				case 1:
					bc.insertBook(new Book (title, author, "인문", price));
					break;
				case 2:
					bc.insertBook(new Book (title, author, "자연과학", price));
					break;
				case 3:
					bc.insertBook(new Book (title, author, "의료", price));
					break;
				case 4: 
					bc.insertBook(new Book (title, author, "기타", price));
					break;
				
			}
				
	}

	private void selectList() {
		List<Book> list =bc.selectList();
		
		if(list.isEmpty()) {
			System.out.println("도서가 존재하지 않습니다.");
		} else {
			for(int i =0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}

	private void searchBook() {
		System.out.println("keyword");
		String search = scn.next();
		
		List<Book> list = bc.searchBook(search);
			for(int i =0; i<list.size(); i++) {
				
				System.out.println(list.get(i));
			}
			
	}

	private void deleteBook() {
			System.out.println("title");
		String title = scn.next();
			System.out.println("author");
		String author = scn.next();
		
			if(bc.selectList().contains(bc.deleteBook(title, author))) {
				bc.selectList().remove(bc.deleteBook(title, author));
				System.out.println("성공적으로 삭제했습니다.");
			} else {
				System.out.println("삭제할 도서를 찾지 못했습니다.");
			}
	}

	private void ascBook() {
		if(bc.ascBook() == 1) {
			System.out.println("정렬에 성공했습니다.");
		} else {
			System.out.println("정렬에 실패했습니다.");
		}
	}

	
}
