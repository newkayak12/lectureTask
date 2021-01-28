package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	public String calcArea(int x, int y, int radius) {
		String result = "Area : ";
			Circle cir = new Circle(x,y,radius);
		result += (Math.PI*radius*radius);
			return result;
		}
		
		public String calcPerimeter(int x, int y, int radius) {
			String result = "Perimeter : ";
			Circle cir = new Circle(x,y,radius);
			result += cir.getRadius()*2*Math.PI;
			
			return result;
		}
}
