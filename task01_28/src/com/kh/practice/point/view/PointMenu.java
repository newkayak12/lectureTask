package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	Scanner scn = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	
		public void mainMenu()	{
			System.out.println("====== Main Menu ======");
			System.out.println("      1. circle");
			System.out.println("      2. rectangle");
			System.out.println("      3. terminate");
			System.out.print("  > ");
			int input = scn.nextInt();
			
				switch(input) {
					case 1: circleMenu();
							break;
					case 2: rectangleMenu();
							break;
					case 3: System.out.println("terminate");	
							return;
				}
		}


		private void rectangleMenu() {

			System.out.println("====== Rectangle Menu ======");
			System.out.println("      1. Perimeter");
			System.out.println("      2. area");
			System.out.println("      3. return to main");
			System.out.print("  > ");
			int input = scn.nextInt();
			
				switch(input) {
					case 1: regcircum();
							break;
					case 2: regarea();
							break;
					case 3: mainMenu();
							break;
				}
		}


		private void regarea() {
				System.out.print("enter value of x : ");
			int x = scn.nextInt();
				System.out.print("enter value of y : ");
			int y = scn.nextInt();
				System.out.print("enter value of width : ");
			int width = scn.nextInt();
				System.out.print("enter value of height : ");
			int height = scn.nextInt();
			String result = rc.calcArea(x, y, height, width);
				System.out.println("Area of Recetangle : "+ result);
				mainMenu();
		}


		private void regcircum() {
			System.out.print("enter value of x : ");
			int x = scn.nextInt();
				System.out.print("enter value of y : ");
			int y = scn.nextInt();
				System.out.print("enter value of width : ");
			int width = scn.nextInt();
				System.out.print("enter value of height : ");
			int height = scn.nextInt();
			String result = rc.calcPerimeter(x, y, height, width);
				System.out.println("Perimeter of Rectangle : "+ result);
				mainMenu();
		}


		private void circleMenu() {

			System.out.println("====== Circle Menu ======");
			System.out.println("      1. Circumference");
			System.out.println("      2. Area");
			System.out.println("      3. return to menu");
			System.out.print("  > ");
			int input = scn.nextInt();
			
				switch(input) {
					case 1: circum();
							break;
					case 2: cirArea();
							break;
					case 3: mainMenu();
							break;
				}
		}


		private void cirArea() {
				System.out.print("enter value of x : ");
			int x = scn.nextInt();
				System.out.print("enter value of y : ");
			int y = scn.nextInt();
				System.out.print("enter value of radius : ");
			int radius = scn.nextInt();
			String result =	cc.calcArea(x, y, radius);
				System.out.println(result);
				mainMenu();
				
		}


		private void circum() {
			System.out.print("enter value of x : ");
			int x = scn.nextInt();
				System.out.print("enter value of y : ");
			int y = scn.nextInt();
				System.out.print("enter value of radius : ");
			int radius = scn.nextInt();
			String result =	cc.calcCircumference(x, y, radius);
				System.out.println(result);			
				mainMenu();
		}
	
}
