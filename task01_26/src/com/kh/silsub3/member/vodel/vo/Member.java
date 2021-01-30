package com.kh.silsub3.member.vodel.vo;

public class Member  {
	private String id, name, password, email;
	private char gender;
	private int age;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Member(String id, String name, String password, String email, char gender, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String memberInfo() {
		String result =  id+"\t"+name+"\t"+password+"\t"+email+"\t"+gender+"\t"+age;
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member other = (Member) obj;
			if(this.name.equals(((Member) obj).getName())) {
				return true;
			}
		}
		return false;
	}



	



	
}
