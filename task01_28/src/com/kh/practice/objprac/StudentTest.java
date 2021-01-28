package com.kh.practice.objprac;

import java.util.Scanner;

public class StudentTest {
	public static void main(String [] args) {
		Student arrays[] = new Student[3];
		
		Scanner scn = new Scanner(System.in);
		for(int i=0; i<arrays.length; i++) {
			System.out.println("=== no "+(i+1)+"  ===");
				System.out.print("name : ");
			String nam = scn.next();
				System.out.print("age : ");
			int age = scn.nextInt();
				System.out.print("height : ");
			int hei = scn.nextInt();
				System.out.print("weight : ");
			int wei = scn.nextInt();
				System.out.print("number : ");
			String num = scn.next();
				System.out.print("major : ");
			String maj = scn.next();
			
			arrays[i] = new Student(nam, age, hei, wei, num, maj);
			
				
	}
		System.out.println("name"+"\t"+"age"+"\t"+"weigth"+"\t"+"number"+"\t"+"major"+"\n");
		for(int i=0; i<arrays.length; i++) {
			System.out.println(arrays[i].printInformation());
		}
		
		
	}
}
