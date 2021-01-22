package com.kh.example.practice2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product() {
		
	}
	
	public void information() {
		System.out.println(pName);
		System.out.println(price);
		System.out.println(brand);
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName=pName;
	}
	
	public String getbrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	
}
