package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
Scanner sc = new Scanner(System.in);
	
	public void practice1() {
			System.out.println("Enter any number :");
		int num = sc.nextInt();

			if(num>0) {
				for ( int i = 1; i<=num; i++)
					System.out.println(i);
			} else {
				System.out.println("wrong number");
			}
	}
		
		
	public void practice2() {
		boolean run =true;
main:		while(run) {
					System.out.println("Enter any number :");
				int num = sc.nextInt();
		
					if(num>0) {
						for ( int i = 1; i<=num; i++) {
							System.out.println(i);
							
							if(i==num) { break main;}
						}
					} else {
						System.out.println("wrong number");
					}
			}
	}		
	
	
	
	public void practice3() {
			System.out.println("Enter any number :");
		int num2 = sc.nextInt();
			if(num2>0) {
				for( ; num2>0; num2-- ) {
					System.out.println(num2);
				}
			} else {
				System.out.println("enter a number greater than one");
			}
	}
		
	
	
	
	
	public void practice4() {
		boolean run =true;
		
			do {
				System.out.println("Enter any number :");
				int num2 = sc.nextInt();
					if(num2>0) {
						for( ; num2>0; num2-- ) {
							System.out.println(num2);
							if(num2==1) { run = false;}
						}
					} else {
						System.out.println("enter a number greater than one");
					}
				
				
			}while(run);
		
		
		
		}
		
	
	
	
	public void practice5() {
			System.out.println("enter any number");
		int result=0;
		int num = sc.nextInt();
			for( int i = 1; i<=num; i++) {
				result +=i;
					
					if(i<num) {
							System.out.print(i+"+");
					} else if (i==num) {
							System.out.print(i+"=");
					}
			}
		System.out.println(result);
	}
	
	
	
	public void practice6() {
			System.out.println("enter any number");
		int fir = sc.nextInt();
			System.out.println("enter any number");
		int sec = sc.nextInt();
			if(fir<sec) {
				if(fir>=1) {
					for(int i = fir; i<=sec; i++ ) {
						System.out.println(i);
					}
				} else { System.out.println("enter any number greater than one");
				}
			} else if (fir>sec) {
				if(fir>=1) {
					for(int i = sec; i<=fir; i++ ) {
						System.out.println(i);
					}
				} else { System.out.println("enter any number greater than one");
				}
				
			}
	}
	
	
	public void practice7() {
		boolean run = true;
			do {
				System.out.println("enter any number");
				int fir = sc.nextInt();
					System.out.println("enter any number");
				int sec = sc.nextInt();
					if(fir<sec) {
						if(fir>=1) {
							for(int i = fir; i<=sec; i++ ) {
								System.out.println(i);
								if(i==sec) {run =false;}
							}
						} else { System.out.println("enter any number greater than one");
						}
					} else if (fir>sec) {
						if(fir>=1) {
							for(int i = sec; i<=fir; i++ ) {
								System.out.println(i);
								if(i==sec) {run =false;}
							}
						} else { System.out.println("enter any number greater than one");
						}
						
					}
			}while(run);
	}
	
	
	public void practice8() {
			System.out.println("enter any number");
		int multi = sc.nextInt();
			System.out.println("======" + multi+ "단======");
			for(int i = 1; i<=9; i++) {
				System.out.println(multi+" * "+i+" = "+ multi*i);
			}
				
		
	}
	public void practice9() {
			System.out.println("enter any number");
		int multi = sc.nextInt();
			if(multi<=9 && multi>0) {
				for(int j = multi; j<=9; j++) {
						
						System.out.println("======" + j+ "단======");
						for(int i = 1; i<=9; i++) {
							System.out.println(j+" * "+i+" = "+ j*i);
						}
				}
			} else if (multi>9) {
				System.out.println("enter number less than nine");
			}
	}
	public void practice10() {
		boolean run =true;
			do {
				System.out.println("enter any number");
				int multi = sc.nextInt();
					if(multi<=9 && multi>0) {
						for(int j = multi; j<=9; j++) {
								
								System.out.println("======" + j+ "단======");
								for(int i = 1; i<=9; i++) {
									System.out.println(j+" * "+i+" = "+ j*i);
								}
							if(j==9) { run =false;}
						}
					} else if (multi>9) {
						System.out.println("enter number less than nine");
					}
				
			}while(run);
		
	}
	public void practice11() {
			System.out.println("enter any number");
		int number = sc.nextInt();
			System.out.println("enter any common diffence");
		int comcd = sc.nextInt();
			System.out.println("1.increase / 2.decrease ");
		int choice= sc.nextInt();
		
		
			if(choice == 1) {
				System.out.print(number);
				for (int i = 1; i<=9; i++){
					number += comcd;
					System.out.print(" "+number);
					
				}
			}else if (choice ==2) {
				System.out.print(number);
				for (int i = 9; i>=1; i--){
					number -= comcd;
					System.out.print(" "+number);
					
				}
			}
		
	}
	public void practice12() {
			System.out.print("operator (+,-,*,/)");
		String opr=sc.next();
			System.out.print("number 1: ");
		int num1= sc.nextInt();
			System.out.print("number 2: ");
		int num2= sc.nextInt();
			
			if(opr.equals("+")) {
				System.out.println(num1 + " + " + num2 + " = " +(num1+num2));
				
			} else if(opr.equals("-")) {
				System.out.println(num1 + " - " + num2 + " = " +(num1-num2));
				
			} else if(opr.equals("*")) {
				System.out.println(num1 + " * " + num2 + " = " +(num1*num2));
			} else if(opr.equals("/")) {
				if(num2 == 0) {
					System.out.println("can't operate.");
				} else {
					System.out.println(num1 + " / " + num2 + " = " +(num1/num2));
				}
			} else if(opr.equals("exit")) {
				System.out.println("terminated");
				
			} else {
				System.out.println(opr+" is not operator.");
				
			}
		
	}
	
	
	public void practice13() {
			System.out.println("enter any number");
		int num = sc.nextInt();
			for(int i = 1; i<=num; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
					if(i==j) {
						System.out.println();
					}
				}
			}
		
	}
	public void practice14() {
		System.out.println("enter any number");
		int num = sc.nextInt();
			for(int i = 1; i<=num; i++) {
				for(int j=num; j>=i; j--) {
					System.out.print("*");
					if(i==j) {
						System.out.println();
					}
				}
			}
		
	}

}
