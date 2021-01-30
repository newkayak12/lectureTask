package com.kh.silsub3.member.view;

import java.util.Scanner;

import com.kh.silsub3.member.controller.MemberManager;
import com.kh.silsub3.member.vodel.vo.Member;

public class MemberMenu {
	Scanner scn = new Scanner(System.in);
	MemberManager mManager = new MemberManager();
	
	public MemberMenu() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void mainMenu() {
		while(true) {
			System.out.println("***** membership management program *****");
			System.out.println("           1. enroll");
			System.out.println("           2. member lookup");
			System.out.println("           3. modify member info");
			System.out.println("           4. sort member info");
			System.out.println("           5. delete membership");
			System.out.println("           6. lookup all member");
			System.out.println("           9. quit");
			System.out.print(" > ");
		int choice = scn.nextInt();
				
		
			switch(choice) {
				case 1: 
						memberInput();
					break;
				case 2:
					 	searchMenu();
					break;
				case 3:
						modifyMenu();
					break;
				case 4:
						sortMenu();
					break;
				case 5:
						deleteMeber();
					break;
				case 6:
						showAll();
					break;
				case 9:
					return;
					
			}
		
			
		}
	}
	
	



	private void memberInput() {
		mManager.enroll();
	}


	public void searchMenu() {
			System.out.println("***** member search menu *****");
			System.out.println("       1. search with id");
			System.out.println("       2. search with name");
			System.out.println("       3. search with email");
			System.out.println("       9. return to menu");
			System.out.println(">");
		int choice = scn.nextInt();
			
			switch(choice) {
				case 1:
					int numberId =mManager.searchid();
					if(numberId>-1) {
						System.out.println(mManager.getMembers()[numberId].memberInfo());
					} else {
						System.out.println("invalid id");
					}
					break;
				
				case 2:
					int numberName = mManager.searchName();
					if(numberName>-1) {
						System.out.println(mManager.getMembers()[numberName].memberInfo());
					}else {
						System.out.println("invalid name");
					}
					break;
				
				case 3:
					int numberEmail = mManager.searchEmail();
					if(numberEmail>-1) {
						System.out.println(mManager.getMembers()[numberEmail].memberInfo());
					}else {
						System.out.println("invalid email");
					}
					break;
				
				case 9: 
					return;
				
			}
		
		
		
	}
	
	public void modifyMenu() {
			System.out.println("***** member search menu *****");
			System.out.println("       1. password change");
			System.out.println("       2. email change");
			System.out.println("       3. age change");
			System.out.println("       9. return to menu");
			System.out.println(">");
		int choice = scn.nextInt();
			
			switch(choice) {
			
				case 1 :
					int numberId =mManager.searchid();
					if(numberId>-1) {
							System.out.println(mManager.getMembers()[numberId].memberInfo());
							System.out.println("enter password what you want to change");
						String password = scn.next();
						mManager.getMembers()[numberId].setPassword(password);
							System.out.println("success");
					} else {
						System.out.println("invalid id");
					}
					break;
				case 2 : 
					int numberName = mManager.searchName();
					if(numberName>-1) {
						System.out.println(mManager.getMembers()[numberName].memberInfo());
						System.out.println("enter id what you want to change");
					String id = scn.next();
					mManager.getMembers()[numberName].setId(id);;
						System.out.println("success");
				} else {
					System.out.println("invalid id");
				}
					break;
				case 3 : 
					int numberEmail = mManager.searchEmail();
					if(numberEmail>-1) {
						System.out.println(mManager.getMembers()[numberEmail].memberInfo());
						System.out.println("enter age what you want to change");
					int age = scn.nextInt();	
					mManager.getMembers()[numberEmail].setAge(age);
						System.out.println("success");
				} else {
					System.out.println("invalid id");
				}
					break;
				case 9 :
					return;
			}
	}
	public void sortMenu()	{
		System.out.println("***** member search menu *****");
		System.out.println("       1. Asending by name");
		System.out.println("       2. Desending by name");
		System.out.println("       3. Asending by age");
		System.out.println("       4. Desending by age");
		System.out.println("       5. sorting by gender");
		System.out.println("       9. return to menu");
		System.out.println(">");
	int choice = scn.nextInt();
		
		switch(choice) {
		
			case 1 :
				mManager.sortProcessAsendName();
				break;
			case 2:
				mManager.sortProcessDesendName();
				break;
			case 3: 
				mManager.sortProcessAsendAge();
				break;
			case 4: 
				mManager.sortProcessDesendAge();
				break;
			case 5:
				mManager.sortProcessGender();
				break;
			case 9:
				return;
			
		}

		for(int i =0; i<mManager.getMembers().length; i++) {
			if(mManager.getMembers()[i]!=null) {	
				System.out.println(mManager.getMembers()[i].memberInfo());
			}
		}
	}
	
	private void deleteMeber() {
		mManager.deleteMember();
		
	}

	private void showAll() {
		mManager.showAll();
	}
	
}
