package com.kh.silsub2.person.model.vo;

public class Person {
	private String name, address;
	private int age;
	private double height, weight;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String address, int age, double height, double weight) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
