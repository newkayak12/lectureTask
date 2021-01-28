package com.kh.example.practice6.model.vo;

public class Book {
	private String title, publisher, author;
	private int price;
	private double discountRate;
	
	
	public Book() {
		
	}
	
	public Book(String title, String publisher, String author) {
		this.title=title;
		this.publisher = publisher;
		this.author = author;
	}
//	생성자??? : 필드 초기화....
//	title, 이랑 필드랑 같은 이유는 둘이 같음을 명시하는 
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
//		필드와 매개변수의 명칭이 같지 않다면 굳이 this.를 쓰지 않아도 된다. 
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
// this로 마지막에 한 번에 받는 방법이 있었는데 찾아봐야겠다 ㅋㅋㅋ....
	
	public void information() {
		System.out.println(title);
		System.out.println(publisher);
		System.out.println(author);
		System.out.println(price);
		System.out.println(discountRate);
//
		
	}
}
