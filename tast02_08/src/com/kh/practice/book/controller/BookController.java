package com.kh.practice.book.controller;

import java.io.File;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDao;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	 BookDao bd = new BookDao();
	 File f = new File("book.txt");
	 
	 public void makeFile() {
		 if(f.exists()) {
			 System.out.println("이미 파일이 존재합니다.");
			 System.out.println("이미 작성된 내용에 이어서 추가적으로 작성합니다.");
			 
		 } else {
			 
			 try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
	 
	 public void fileSave(Book[] bArr) {
		 
		 bd.fileSave(bArr);
		 
		 
		 
	 }
	 
	 public Book[] fileRead() {
		 
		 return bd.fileRead();
	 }
	 
}
