package com.kh.practice.point.model.vo;

public class Point {
	protected int x, y;

	public Point() {
		// TODO Auto-generated constructor stub
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
	
	@Override
	public String toString() {
		String result = "x : "+x+" "+"y : "+y;
		return result;
				
	}	
	
	
	
	
}
