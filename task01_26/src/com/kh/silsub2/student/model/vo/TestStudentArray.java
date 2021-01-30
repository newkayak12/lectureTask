package com.kh.silsub2.student.model.vo;

import java.util.Scanner;

import com.kh.silsub2.student.controller.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		Student[] student = new Student[10];
		Scanner scn = new Scanner(System.in);
		int count =0;
		double avg =0.0;
		while(true) {
			
				for(int i=0; i<student.length; i++) {
					
						
						System.out.println("name : ");
					String name = scn.next();
						System.out.println("grade : ");
					int grade = scn.nextInt();
						System.out.println("class : ");
					int classNo	= scn.nextInt();
						System.out.println("kor : ");
					int kor = scn.nextInt();
						System.out.println("eng : ");
					int eng = scn.nextInt();
						System.out.println("math : ");
					int math = scn.nextInt();
					
					student[i] = new Student(grade, classNo, kor, eng, math, name);
					count++;
					
					System.out.println(student[i].getName()+" "+student[i].getGrade()+" "+student[i].getClassNo()+" "+
							student[i].getKor()+" "+student[i].getEng()+" "+student[i].getMath()+"\n");
					System.out.println("inquary average?");
					System.out.println("1. yes / 2. no");
					int input = scn.nextInt();
					
					if(input == 1) {
						 avg += (student[i].getKor()+student[i].getEng()+student[i].getMath())/((i+1)*3);
						System.out.println("average is " +avg);
					}
					
						System.out.println("continue? 1.yes / 2.no");
					int choice = scn.nextInt();
						if(choice ==2) {
							return;
						}
				}
				
				
				
		}
	}

}
