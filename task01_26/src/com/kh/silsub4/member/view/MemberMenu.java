package com.kh.silsub4.member.view;

import java.util.Scanner;

import com.kh.silsub4.member.controller.MemberManager;

public class MemberMenu {
	Scanner scn = new Scanner(System.in);
	MemberManager mm = new MemberManager();
	
	
	
	public void mainMenu() {
		while(true) {
				System.out.println("========== member management menu ==========");
				System.out.println("          1.    register ");
				System.out.println("          2.    searching member info ");
				System.out.println("          3.    modify member info ");
				System.out.println("          4.    delete member info ");
				System.out.println("          5.    show all member info ");
				System.out.println("          9.    quit ");
				System.out.println("> ");
			int choice = scn.nextInt();
			
			
			
				switch(choice){
					case 1:
						mm.insertMember();
						break;
					case 2:
						searchMemberMenu();
						break;
					case 3:
						updateMemberMenu();
						break;
					case 4:
						deleteMemberMenu();
						break;
					case 5:
						mm.printAllMember();
						break;
					case 9:
						System.out.println("terminated");
						return;
						
				}
		}
	}



	private void deleteMemberMenu() {
		System.out.println("========== delete member info ==========");
		System.out.println("         1.    delete member");
		System.out.println("         2.    delete all member");
		System.out.println("         9.    return to menu ");
		System.out.println(">");
	int choice = scn.nextInt();
		switch(choice) {
			case 1:
				mm.deleteOne();
				break;
			case 2:
				mm.deleteAll();
				break;
			case 9:
				System.out.println("return to menu");
				return;
		}
	}



	private void updateMemberMenu() {
		System.out.println("========== update member info ==========");
		System.out.println("         1.    update password ");
		System.out.println("         2.    update name");
		System.out.println("         3.    update email");
		System.out.println("         9.    return to menu ");
		System.out.println(">");
	int choice = scn.nextInt();
		switch(choice) {
			case 1:
				mm.updatePwd();
				break;
			case 2:
				mm.updateName();
				break;
			case 3:
				mm.updateEmail();
				break;
			case 9:
				System.out.println("return to menu");
				return;
		}		
	}



	private void searchMemberMenu() {
			System.out.println("========== search member info ==========");
			System.out.println("         1.    searching by id ");
			System.out.println("         2.    searching by name");
			System.out.println("         3.    searching by eamil ");
			System.out.println("         9.    return to menu ");
			System.out.println(">");
		int choice = scn.nextInt();
			switch(choice) {
				case 1:
					mm.searchId();
					break;
				case 2:
					mm.searchName();
					break;
				case 3:
					mm.searchEmail();
					break;
				case 9:
					System.out.println("return to menu");
					return;
			}
		
	}

}
