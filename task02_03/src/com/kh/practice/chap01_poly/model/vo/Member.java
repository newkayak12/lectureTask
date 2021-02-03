package com.kh.practice.chap01_poly.model.vo;

public class Member {
	private String name;
	private int age;
	private char gender;
	private int couponCount;
	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
// 디폴트 생성자

	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
//	매개변수 있는 생성자
	
	@Override
	public String toString() {
		String result = "Member [ name = " + name + ", age = " + age + ", gender =  "+ gender + ", couponCount = " +couponCount + "]";
		return result;
	}
// 오버라이드

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public int getCouponCount() {
		return couponCount;
	}


	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}
//	 일단 만들어 놓은 get/setter
}
