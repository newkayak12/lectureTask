package com.kh.example.practice4.model.vo;

public class Student {

	private int grade, classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 2;
		classroom =4;
		name = "kim";
		height = 170.1;
		gender = 'M';
	}
	
	public Student() {
		
	}
	
	public void information	() {
		System.out.println(grade);
		System.out.println(classroom);
		System.out.println(name);
		System.out.println(height);
		System.out.println(gender);
		
	}
}
