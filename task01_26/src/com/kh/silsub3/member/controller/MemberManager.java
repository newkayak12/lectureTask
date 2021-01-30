package com.kh.silsub3.member.controller;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.silsub3.member.vodel.vo.Member;

public class MemberManager {
	Scanner scn = new Scanner(System.in);
	public static final int SIZE = 10;
	private Member[] members = new Member[SIZE];
	
	public Member[] getMembers() {
		return members;
	}

	public void setMembers(Member[] members) {
		this.members = members;
	}
	
	int count =0;
	public void enroll()	{
//			System.out.println("how many times do you create :");
//		int choice = scn.nextInt();
			System.out.println("name : ");
		String name = scn.next();
			System.out.println("email : ");
		String email = scn.next();
			System.out.println("id : ");
		String id = scn.next();
			System.out.println("password : ");
		String password = scn.next();
			System.out.println("gender : ");
		char gender = scn.next().charAt(0);
			System.out.println("age : ");
		int age = scn.nextInt();
		
		for( int i =0; i<members.length; i++) {
			if(members[i]==null) {
				members[i]= new Member(id, name, password, email, gender, age);
				members[i].memberInfo();
				count++;
				System.out.println("student no. "+count);
				break;
			}
		}
		
		
		
	}
	
	public int searchid() {
			System.out.println("id? ");
		String id = scn.next();
			for(int i=0; i<members.length; i++) {
				 if(members[i]!=null && id.equals(members[i].getId())) {
					 return i;
				 }
			}
			return -1;
	}

	public int searchName() {
			System.out.println("name? ");
		 String name = scn.next();
			for(int i =0; i<members.length; i++) {
				 if(members[i]!=null && name.equals(members[i].getName())) {
					 return i;
				 }
			}
			return -1;
	}

	public int searchEmail() {
		System.out.println("email? ");
		 String email = scn.next();
			for(int i =0; i<members.length; i++) {
				 if(members[i]!=null && email.equals(members[i].getEmail())) {
					 return i;
				 }
			}
			return -1;
	}

	public void sortProcessAsendName() {
		for( int i =0; i<members.length; i++) {
			
			if(members[i]!=null) {
				for(int k =0; k<members.length; k++) {
					if(members[k]!=null) {
						if(i!=k) {
						int compare = members[i].getName().compareTo(members[k].getName());
							if(compare == 0) {
								
							} else if(compare<0) {
								Member temp = new Member(members[i].getId(), members[i].getName(), members[i].getPassword(), members[i].getEmail(),members[i].getGender() ,members[i].getAge());
								members[i]=members[k];
								members[k]=temp;
							} else if(compare>0) {
							}
						}
					}	
				}
				
			}
			
		
		}
	}
	
	
	public void sortProcessDesendName() {
		for( int i =0; i<members.length; i++) {
			
			if(members[i]!=null) {
				for(int k =0; k<members.length; k++) {
					if(members[k]!=null) {
						if(i!=k) {
						int compare = members[i].getName().compareTo(members[k].getName());
							if(compare == 0) {
								
							} else if(compare<0) {
							
							} else if(compare>0) {
								Member temp = new Member(members[k].getId(), members[k].getName(), members[k].getPassword(), members[k].getEmail(),members[k].getGender() ,members[k].getAge());
								members[k]=members[i];
								members[i]=temp;
							}	
						}
					}	
				}
				
			}
			
		
		}
	}

	public void sortProcessAsendAge() {
		for( int i =0; i<members.length; i++) {
					
			if(members[i]!=null) {
				for(int k =0; k<members.length; k++) {
					if(members[k]!=null) {
						if(i!=k) {
						int compare = 0;
							if(members[i].getAge()>members[k].getAge()) {
								compare = 1;
							} else if (members[i].getAge()==members[k].getAge()) {
								compare = 0;
							} else if (members[i].getAge()<members[k].getAge()) {
								compare = -1;
							}
						
						
							if(compare == 0) {
								
							} else if(compare<0) {
								Member temp = new Member(members[i].getId(), members[i].getName(), members[i].getPassword(), members[i].getEmail(),members[i].getGender() ,members[i].getAge());
								members[i]=members[k];
								members[k]=temp;
							} else if(compare>0) {
								
							}
						}
					}	
				}
				
			}
			
		
		}
	}

	public void sortProcessDesendAge() {
		for( int i =0; i<members.length; i++) {
			
			if(members[i]!=null) {
				for(int k =0; k<members.length; k++) {
					if(members[k]!=null) {
						if(i!=k) {
						int compare = 0;
							if(members[i].getAge()>members[k].getAge()) {
								compare = 1;
							} else if (members[i].getAge()==members[k].getAge()) {
								compare = 0;
							} else if (members[i].getAge()<members[k].getAge()) {
								compare = -1;
							}
						
						
							if(compare == 0) {
								
							} else if(compare<0) {
								
							} else if(compare>0) {
								Member temp = new Member(members[k].getId(), members[k].getName(), members[k].getPassword(), members[k].getEmail(),members[k].getGender() ,members[k].getAge());
								members[k]=members[i];
								members[i]=temp;
							}
						}
					}	
				}
				
			}
			
		
		}
		
	}

	public void sortProcessGender() {
		for( int i =0; i<members.length; i++) {
			
			if(members[i]!=null) {
				for(int k =0; k<members.length; k++) {
					if(members[k]!=null) {
						if(i!=k) {
						int compare = 0;
							if(members[i].getGender()>members[k].getGender()) {
								compare = -1;
							} else if (members[i].getGender()==members[k].getGender()) {
								compare = 0;
							} else if (members[i].getGender()<members[k].getGender()) {
								compare = 1;
							}
						
						
							if(compare == 0) {
								
							} else if(compare<0) {
								Member temp = new Member(members[i].getId(), members[i].getName(), members[i].getPassword(), members[i].getEmail(),members[i].getGender() ,members[i].getAge());
								members[i]=members[k];
								members[k]=temp;
							
							} else if(compare>0) {
								Member temp = new Member(members[k].getId(), members[k].getName(), members[k].getPassword(), members[k].getEmail(),members[k].getGender() ,members[k].getAge());
								members[k]=members[i];
								members[i]=temp;
							}
						}
					}	
				}
				
			}
			
		
		}
	}

	public void deleteMember() {
			System.out.println("enter name to delete");
		String name = scn.next();
			for(int i=0; i<members.length; i++) {
				
				if((members[i]!=null)&&members[i].getName().equals(name)) {
					members[i]	= new Member();
				}
			}
	}

	public void showAll() {
		for(int i =0 ; i< members.length; i++) {
			if(members[i]!=null) {
				System.out.println(members[i].memberInfo());
			}
		}
		
	}
	







	
	
}
