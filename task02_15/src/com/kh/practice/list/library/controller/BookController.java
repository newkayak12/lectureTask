package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	List<Book> list = new ArrayList<>();
	
	
	public BookController() {
		// TODO Auto-generated constructor stub
	}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	
	public ArrayList<Book> selectList()	{
		
		return (ArrayList) list; 
	}
	
	
	public ArrayList<Book> searchBook(String keyWorld) {
		
		ArrayList<Book> searcher = new ArrayList<Book>();
			
			for ( int i =0; i<list.size(); i++) {
				String temp = list.get(i).getTitle();
				if(temp.contains(keyWorld)) {
					searcher.add(list.get(i));
				}
			}
			
			return searcher;
	}
			
		
	
	
	public Book deleteBook(String title, String author) {
		
		return new Book(title, author, null, 0);
	}
	
	
	public int ascBook() {
		Collections.sort(list);
		
		
		return 1;
	}
}
