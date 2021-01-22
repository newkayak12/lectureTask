package com.kh.example.practice3.model.vo;

public class Circle {

	
	private double pi = 3.14;
	private int radius = 1;
	
	public Circle() {
		
	}
	
	public void incrementRadius() {
		radius++;
	}
	
	public void getAreaOfCircle() {
		System.out.println(radius*2*pi);
	}
	
	public void getSizeOfCircle() {
		System.out.println(radius*radius*pi);
	}
	
	
	public double getPi() {
		return pi;
	}
	public int getRadius() {
		return radius;
	}
	
	public void setPi(double pi) {
		this.pi=pi;
	}
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	
}
