package com.kh.silsub2.point.model.vo;

public class Circle extends Point {
	private int radius;
	
	public Circle() {
		super();
	}

	public Circle(int x, int y) {
		super(x, y);
		double result = (x*x + y*y);
		this.radius = (int) Math.sqrt(result);
	}
	
	public void draw()	{
		System.out.println("( "+super.x+" , "+super.y+" )");
		double circumference = 2*Math.PI*radius;
		 double area = Math.PI*radius*radius;
		 
		 System.out.printf("Circumferce : %.1f // area : %.1f\n", circumference, area);
	}
}
