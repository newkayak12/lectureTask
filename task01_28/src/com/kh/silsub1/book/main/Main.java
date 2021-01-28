package com.kh.silsub1.book.main;

import com.kh.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		Book book1 = new Book("Sign of fourth","Conan Doyle", 14500);
		Book book2 = new Book("Hound of baskerville", "Conan Doyle", 15000);
		
		
//		System.out.println(book1.toString());
//		System.out.println(book2.toString());
		
		
//		System.out.println("is it same? :" + book1.equals(book2));
		String[] str = {"김","치"};
		String[] str2 = str;
		
		
		
		Book book1Copy = book1;
		Book book1DeepCopy = book1.deepCopy();
		Book book2Copy = book2;
		Book book2DeepCopy = book2.deepCopy();
		
		
		
//		System.out.println("is it same? :" + (book1 == book1Copy));
//		System.out.println("is it same? :" + (book1 == book1DeepCopy));
//		System.out.println("is title same? :" + book1.getTitle().equals(book1Copy.getTitle()));
//		System.out.println("is author same? :" + book1.getAuthor().equals(book1Copy.getAuthor()));
//		System.out.println("is price same? :" + (book1.getPrice()==book1Copy.getPrice()));
//		
			
		book1.setTitle("1");
		System.out.println("\n title");
		System.out.println("ori  "+book1);
		System.out.println("copy  "+book1Copy);
		System.out.println("deep  "+book1DeepCopy);
		
		
		System.out.println("\n hashcode()!");
		System.out.println("ori "+book1.hashCode());
		System.out.println("copy "+ book1Copy.hashCode());
		System.out.println("deep  "+book1DeepCopy.hashCode());
	}

}
