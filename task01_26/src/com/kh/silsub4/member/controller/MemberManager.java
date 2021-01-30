package com.kh.silsub4.member.controller;

import java.util.Scanner;

import com.kh.silsub4.member.vo.Member;

public class MemberManager {
	private static Member[] m = new Member[10];
	static int ctn =0; 
	//amount of member
	private Scanner scn = new Scanner(System.in);

	public void insertMember() {
			System.out.println("ID");
		String id = scn.next();
			System.out.println("password");
		String password = scn.next();
			System.out.println("name");
		String name = scn.next();
			System.out.println("age");
		int age = scn.nextInt();
			System.out.println("gender");
		char gender = scn.next().charAt(0);
			System.out.println("email");
		String email = scn.next();
		for(int i=0; i<m.length; i++) {
			if(m[i]==null) {
				ctn++;
				System.out.println("member no "+ ctn);
				m[i] = new Member(id, password, name, age, gender, email);
				System.out.println("registration success! return to menu");
				
				break;
			}
		}
	}
	
	public void searchId() {
			System.out.println("enter id");
		String id = scn.next();
			for(int i =0; i<m.length; i++) {
				if(m[i]!=null) {
					if(m[i].getUserId().equals(id)) {
						printOne(m[i]);
						
					} else {
						System.out.println("not found");
					}
				}
			}
		
	}
	
	public void searchName() {
		System.out.println("enter name");
		String name = scn.next();
			for(int i =0; i<m.length; i++) {
				if(m[i]!=null) {
					if(m[i].getUserName().equals(name)) {
						printOne(m[i]);
						
					} else {
						System.out.println("not found");
					}
				}
			}
		
	}
	public void searchEmail() {
		System.out.println("enter email");
		String email = scn.next();
			for(int i =0; i<m.length; i++) {
				if(m[i]!=null) {
					if(m[i].getEmail().equals(email)) {
						printOne(m[i]);
						
					} else {
						System.out.println("not found");
					}
				}
			}
		
	}
	public void updatePwd() {
			System.out.println("enter id to modify password");
		String id = scn.next();
		for(int i =0; i<m.length; i++) {
			if(m[i]!=null) {
				if(m[i].getUserId().equals(id)) {
						System.out.println("enter password to update");
					String password = scn.next();
					m[i].setUserpwd(password);
						System.out.println("update success");
					
				} else {
					System.out.println("not found");
				}
			}
		}
		
	}
	public void updateName() {
		System.out.println("enter id to modify name");
		String id = scn.next();
		for(int i =0; i<m.length; i++) {
			if(m[i]!=null) {
				if(m[i].getUserId().equals(id)) {
						System.out.println("enter name to update");
					String name = scn.next();
					m[i].setUserName(name);
						System.out.println("update success");
					
				} else {
					System.out.println("not found");
				}
			}
		}
		
	}
	public void updateEmail() {
		System.out.println("enter id to modify email");
		String id = scn.next();
		for(int i =0; i<m.length; i++) {
			if(m[i]!=null) {
				if(m[i].getUserId().equals(id)) {
						System.out.println("enter email to update");
					String email = scn.next();
					m[i].setEmail(email);
						System.out.println("update success");
					
				} else {
					System.out.println("not found");
				}
			}
		}
		
	}
	public void deleteOne() {
			System.out.println("enter id to withdrawal ");
		String id = scn.next();
		boolean found = true;
		for(int i =0; i<m.length; i++) {
			if(m[i]!=null) {
				if(m[i].getUserId().equals(id)) {
						for(int k=i; k<m.length; k++) {
//							Member temp = new Member(m[i].getUserId(),m[i].getUserpwd(), m[i].getUserName(), m[i].getAge(),m[i].getGender(),m[i].getEmail());
//							if(i+1<m.length) {
//								m[i]=new Member(m[i+1].getUserId(),m[i+1].getUserpwd(), m[i+1].getUserName(), m[i+1].getAge(),m[i+1].getGender(),m[i+1].getEmail());
//							} else {
//								m[i] = new Member();
//							}
							if(i!=k) {
								if(i+1==k) {
								m[i] =new Member(m[k].getUserId(),m[k].getUserpwd(), m[k].getUserName(), m[k].getAge(),m[k].getGender(),m[k].getEmail());	
								m[k] = null;
								found =false;
								}
							}
						}
						ctn--;
						System.out.println("member no "+ ctn);
				} 
			}
			
		}
		if(found) {
			
				System.out.println("not found");
			
		}
			
	}
	public void deleteAll() {
		for(int i = 0; i<m.length; i++) {
			m[i] = null;
			ctn =0;
			
		}
		System.out.println("there is no member");
		}
	public void printOne(Member m) {
		System.out.println(m.getUserName()+" "+m.getAge()+" "+m.getUserId()+" "+m.getUserpwd()+" "+m.getGender()+" "+m.getEmail());
	}

	public void printAllMember() {
		for(int i =0; i<m.length; i++) {
			if(m[i]!=null) {
			System.out.println(m[i].getUserName()+" "+m[i].getAge()+" "+m[i].getUserId()+" "+m[i].getUserpwd()+" "+m[i].getGender()+" "+m[i].getEmail());
			}	
		}
	}

}
