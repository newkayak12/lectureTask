package com.test3_re;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student studentArray [] = new Student[3];
		double age= 0;
		double weight = 0;
		double height =0;
		
		StringBuilder top = new StringBuilder();
		StringBuilder bottom = new StringBuilder();
		int topTemp = 0;
		int bottomTemp =0;
		
		
		
		
		studentArray[0] = new Student("홍길동", 15, 170, 80); 
		studentArray[1] = new Student("한사람", 13, 180, 70);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
			for(Student temp : studentArray) {
				
				temp.studentInfo();
				
				age += temp.getAge();
				weight += temp.getWeight();
				height += temp.getHeight();
			}
			
			System.out.printf("%.1f\n",age/3);
			System.out.printf("%.1f\n",weight/3);
			System.out.printf("%.1f\n",height/3);
			
			
			for( int i =0; i<3; i++) {
					for( int j =0; j<3; i++) {
						 if(i!=j) {
							 if(studentArray[i].getAge()> studentArray[j].getAge()) {
								 topTemp = studentArray[i].getAge();
								 break;
							 }
							 
						 
						 }
					}
			}
			
//			
//			for (int i =2; i>=0; i--) {
//				for(int j=2; i>=0; i--) {
//					
//					if(i!=j) {
//						if(studentArray[i].getAge() < studentArray[j].getAge()) {
//							bottomTemp = studentArray[j].getAge();
//						}
//					}
//				}
//			}
//			
			
			
			for( int i =0; i<3; i++) {
				for( int j =2; j>=0; i--) {
					 if(i!=j) {
						 if(studentArray[i].getAge() > studentArray[j].getAge()) {
							 bottomTemp = studentArray[j].getAge();
							 break;
						 }
						 
					 
					 }
				}
		}
			
			
			
			System.out.println(topTemp);
			System.out.println(bottomTemp);
			
	}

}
