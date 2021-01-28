package com.kh.silsub1.book.model.vo;

import java.util.Objects;

public class Book {

	private String title;
	private String author;
	private int price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		
		
		return title+" "+author+" "+price;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} else if( obj instanceof Book) {
			Book other = (Book) obj;
			if( this.title.equals(other.getTitle()) && this.author.equals(other.getAuthor()) && this.price==other.getPrice()) {
				return true;
			}
		}
		return false;
	}
	
	
	
//	@Override
//	public int hashCode() {
//		
//		return Objects.hash(title,author,price);
//	}
	
	public Book deepCopy() {
		String tempTitle = this.title;
		String tempAuthor = this.author;
		int tempPrice = this.price;
		
		return new Book(tempTitle,tempAuthor,tempPrice);
	}
}
