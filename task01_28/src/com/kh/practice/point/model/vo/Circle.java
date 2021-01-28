package com.kh.practice.point.model.vo;

public class Circle extends Point {
	private int radius;
	
	public Circle() {
		super();
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius =radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw()	{
		System.out.println("( "+super.x+" , "+super.y+" )");
		double circumference = 2*Math.PI*radius;
		 double area = Math.PI*radius*radius;
		 
		 System.out.printf("Circumferce : %.1f // area : %.1f\n", circumference, area);
	}
	
	
	@Override
	public String toString() {
		String result = "x : "+super.x+" y : "+super.y+" radius : "+radius;
		
		return result;
	}
}
