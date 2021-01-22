package com.practice.member;

public class Member {
	private String name,pnum;
	private int age;
	
	
	
	public String sender(String name, String pnum, int age) {
		this.age=age;
		this.name=name;
		this.pnum=pnum;
		
		return name+" "+pnum+" "+age;
	}
	
	private String id,pw,name2,email,addr;
	
	public Member(String id, String pw, String name2, String email, String addr) {
		this.id = id;
		this.pw = pw;
		this.name2 =name2;
		this.email= email;
		this.addr=addr;
			System.out.println(id);
			System.out.println(pw);
			System.out.println(name2);
			System.out.println(email);
			System.out.println(addr);
	}
	
}
