package com.kh.practice.book.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3349132896901287766L;
	
	private String title, author;
	private int price;
	private LocalDate date ;
	private double discount;
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	public Book(String title, String author, int price, LocalDate date, double discount) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
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


	public LocalDate getDate() {
		return date;
	}


	public void setLocalDate(LocalDate date) {
		this.date = date;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
//	SimpleDateFormat sdp = new SimpleDateFormat("yyyy-MM-dd");
//	String df = sdp.format(date);
	
	@Override
	public String toString() {
		return "title : " +title+"\t"+"author : "+author+"\t"+"price : "+price+"\t"+"date : "+date+"\t"+"discount rate : " + discount;
	}

}
