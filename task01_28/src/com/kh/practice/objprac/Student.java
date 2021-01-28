package com.kh.practice.objprac;

public class Student extends Human{
	private String number, major;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, int height , int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	@Override
	public String printInformation() {
		String result="";
		result += name+"\t"+age+"\t"+height+"\t"+weight+"\t"+number+"\t"+major;
		return result;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}	
