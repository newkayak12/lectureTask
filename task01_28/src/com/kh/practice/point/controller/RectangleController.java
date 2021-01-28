package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
	String result = "Area : ";
		Rectangle rec = new Rectangle(x,y,height,width);
	 	result += rec.getHeight() * rec.getHeight();
		return result;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		String result = "Perimeter : ";
		Rectangle rec = new Rectangle(x,y,height,width);
		result += (rec.getHeight()+rec.getWidth())*2;
		
		return result;
	}
}
