package com.kh.practice.point.model.vo;

public class Rectangle extends Point{
	
	private int width;
	private int height;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
//	public void draw() {
//		System.out.println("("+super.x+" , "+super.y+")");
//		double circumference = width*height;
//		double area = 2*(width+height);
//		
//		System.out.printf("circumference : %.1f / area : %.1f\n", circumference,area);
//	}
	
	
	@Override
	public String toString() {
		
		String result = "x : "+ super.x+ " y : "+super.y+ " width : "+ width+" height : "+height;
		return result;
	}
}
