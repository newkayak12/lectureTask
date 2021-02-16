package com.kh.practice.list.library.model.vo;

import java.util.Objects;

public class Book implements Comparable<Book> {
	private String title, author, category;
	private int price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
	
		return " title " + title + " author " + author + " category " + category + " price " + price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title, author, category, price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} else if( obj instanceof Book) {
			Book other = (Book) obj;
			if(this.title.equals(other.title)&&
				this.author.equals(other.author)/*&&
					this.category.equals(other.category)&&
					this.price == other.price*/) {
				return true;
			}
		}
		
		return false;
	
	}

	@Override
	public int compareTo(Book o) {
	
		int result = title.compareTo(o.title);
		return result;
	}
}
