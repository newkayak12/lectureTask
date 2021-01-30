package com.kh.silsub2.student.controller;

public class Student {
	private int grade, classNo, kor, eng, math;
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int grade, int classNo, int kor, int eng, int math, String name) {
		this.grade = grade;
		this.classNo = classNo;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNo() {
		return classNo;
	}

	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
