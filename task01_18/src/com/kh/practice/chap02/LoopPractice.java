package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	Scanner scn = new Scanner(System.in);
	
	public void practice15() {
			System.out.print("Enter any number");
		int num = scn.nextInt();
		boolean prime = true;
			for( int i =2; i<num; i++ ) {
				if(num%i ==0) {
					prime = false;
				}
			}
		
		
		
		
			if(num<2) {
				System.out.println("invalid number");
				
			} else if(prime) {
				System.out.println("this is a prime number");
				
			} else { 
				System.out.println("this is not a prime number.");
			}
	}
	
	
	public void practice16() {
		boolean run = true;
		do {
			
				
			
			
				System.out.print("Enter any number");
			int num = scn.nextInt();
			
			
			boolean prime = true;
			for( int i =2; i<num; i++ ) {
				if(num%i ==0) {
					prime = false;
				}
			}
		
			
				if(num<2) {
					System.out.println("invalid number");
					
				} else if(prime) {
					System.out.println("this is a prime number");
					
				} else { 
					System.out.println("this is not a prime number.");
				}
			
				System.out.print("continue? 1. yes 2.no");
			int choice = scn.nextInt();
				if(choice==2) {
					run=false;
					System.out.println("terminated");
				}
			
		}while(run);
		
		
	}



	public void practice17() {
			System.out.print("Enter any number");
		int num = scn.nextInt();
			int count =0;
			
			boolean prime = true;
			for( int i =2; i<num; i++ ) {
				if(num%i ==0) {
					prime = false;
				}
			}
		
			if(num<2) {
				System.out.println("invalid number");
			} else {
				for(int i =2; i<=num; i++) {
					if(i==2||i==3)	{
						System.out.println(i);
						count++;
					} else if((prime)) {
						System.out.println("prime number");
						System.out.println(i);
						count++;
					} 
				}
			}
		System.out.println("count Number : " + count);
	}
	
	
	
	
	
	public void practice18() {
			System.out.print("Enter any number");
		int num = scn.nextInt();
		int count =0;
			for(int i =1; i<=num; i++) {
				if((i%2==0)||(i%3==0)) {
					System.out.print(i+"  ");
					
					if(i%6==0) {
						count ++;
					}
				}
			}
			System.out.println("count : " + count);
		
		
	}
	
	
	
	public void practice19() {
		
			System.out.println("enter any number");
		int num = scn.nextInt();
		for(int i=1; i<=num; i++) {
				for(int j =num; j>=1; j--) {
					System.out.print(" ");
					if(i>=j) {
					break;
					}
				}
				
				for(int l=1; l<=num; l++) {
					System.out.print("*");
					if(i<=l) {
						System.out.println();
						break;
					}
				}
		}
		
		
	}
	
	public void practice20() {
			System.out.println("enter any number");
		int num = scn.nextInt();
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=num; j++) {
					System.out.print("*");
					if (i<=j){
						System.out.println();
						break;
					}
				}
				
			}
			
			for(int i =1; i<=(num-1); i++) {
				for(int j=(num-1); j>=1; j--) {
					System.out.print("*");
					if(i>=j) {
						System.out.println();
						break;
					}
				}
			}
				
	}
	
	public void practice21() {
			System.out.println("enter any number");
		int num = scn.nextInt();
		int count = 1;
			for(int i =1; i<=num;  i++) {
				for(int j=num; j>=1; j--) {
					System.out.print(" ");
					if(i>=j) {
						break;
					}
				}
				
				
				
				for(int j=1; j<=num+3; j++) {
					System.out.print("*");
					if(j>=count) {
						System.out.println();
						break;
					}
				}
				count+=2;
				
			}
	}
	
	public void practice22() {
			System.out.println("enter any number");
		int num = scn.nextInt();
			for(int i =1; i<=num; i++) {
				for(int j=1; j<=(num); j++) {
					if(i==1||i==num) {
							System.out.print("*");
							if(j==num) {
								System.out.println();
								break;
							}
					} else {
						if(j==1) {
							System.out.print("*");
							
						} else if(j==num) {
							System.out.println("*");
							break;
						} else {
							System.out.print(" ");
						}
					}
				}
			}
	}
	
}