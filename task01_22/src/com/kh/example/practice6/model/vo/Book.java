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
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void information() {
		System.out.println(title);
		System.out.println(publisher);
		System.out.println(author);
		System.out.println(price);
		System.out.println(discountRate);
	}
}
