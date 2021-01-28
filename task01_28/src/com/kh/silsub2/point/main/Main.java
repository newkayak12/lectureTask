package com.kh.silsub2.point.main;

import com.kh.silsub2.point.model.vo.Circle;
import com.kh.silsub2.point.model.vo.Point;
import com.kh.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {
		Circle[] circle = new Circle[3];
		Rectangle[] rectangle = new Rectangle[3];
		Point po = new Point();
		
		System.out.println("circle");
		for (int i =0; i<circle.length; i++) {
			System.out.println("no" + (i+1));
			circle[i] = new Circle(i+1,i+1);
			circle[i].draw();
			
		}
		System.out.println("rectangle");
		for (int i =0; i<rectangle.length; i++) {
			System.out.println("no" + (i+1));
			rectangle[i] = new Rectangle(i+1,i+1);
			rectangle[i].draw();
			
		}
		
		
		
		System.out.println("\n\n\n");
		Point[] point = new Point[5];
		
		for(int i =0; i<point.length; i++) {
			System.out.println("no "+i+1+" Circle");
			point[i]=  new Circle(i+1,i+1);
			point[i].draw();
			System.out.println();
			System.out.println("no "+i+1+" Rectangle");
			point[i] =  new Rectangle(i+1,i+1);
			point[i].draw();
			System.out.println();
			
//			Circle cir = new Circle(i+1, i+1, i+1);
//			Rectangle rec = new Rectangle(i+1,i+1,i+1,i+1);
//			point[i] = new Circle(i+1, i+1, i+1);
//			부모객체 타입은 자식객체로 받을 수 있다.
//			point[i].draw();
			
			

		}
		
		
	}

}
