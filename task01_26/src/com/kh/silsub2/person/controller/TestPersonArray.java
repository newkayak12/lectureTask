package com.kh.silsub2.person.controller;

import java.util.Scanner;

import com.kh.silsub2.person.model.vo.Person;

public class TestPersonArray {
	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		Person[] person = new Person[5];
		
			for(int i = 0; i<person.length; i++) {
					System.out.println("name: ");
				String name = scn.next();
					System.out.println("adress: ");
				String address = scn.next();
					System.out.println("age: ");
				int age = scn.nextInt();
					System.out.println("height: ");
				double heigth = scn.nextDouble();
					System.out.println("weight: ");
				double weight = scn.nextDouble();
					
				person[i] =  new Person(name, address, age, weight, weight);
			}
			
			int avgInt=0;
			double avgWeight=0.0;
			double avgHeight=0.0;
			
			for( int i = 0; i<person.length; i++) {
				
				avgInt += person[i].getAge();
				
				avgWeight += person[i].getWeight();
				
				avgHeight += person[i].getHeight();
				
				
				
			}
			
			System.out.println("avg age: " + avgInt + "avg weight" + avgWeight +"avg height" + avgHeight);
	}
}
