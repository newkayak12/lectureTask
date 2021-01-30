package com.kh.silsub4.member.vo;

public class Member {
 private String UserId, Userpwd, UserName;
 private int age;
 private char gender;
 private String email;
 
 public Member() {
	// TODO Auto-generated constructor stub
}

public Member(String userId, String userpwd, String userName, int age, char gender, String email) {
	UserId = userId;
	Userpwd = userpwd;
	UserName = userName;
	this.age = age;
	this.gender = gender;
	this.email = email;
}

public String getUserId() {
	return UserId;
}

public void setUserId(String userId) {
	UserId = userId;
}

public String getUserpwd() {
	return Userpwd;
}

public void setUserpwd(String userpwd) {
	Userpwd = userpwd;
}

public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
 
 

}
