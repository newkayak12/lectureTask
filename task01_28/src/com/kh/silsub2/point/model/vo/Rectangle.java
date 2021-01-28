package com.kh.silsub2.point.model.vo;

public class Rectangle extends Point{
	
	private int width;
	private int height;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int x, int y) {
		super(x,y);
		this.width = x;
		this.height = y;
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
	
	
	public void draw() {
		System.out.println("("+super.x+" , "+super.y+")");
		double circumference = width*height;
		double area = 2*(width+height);
		
		System.out.printf("circumference : %.1f / area : %.1f\n", circumference,area);
	}
	
	public void draw(Point po) {
		Rectangle other = (Rectangle) po;
		po.draw();
	}
}
