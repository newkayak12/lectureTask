package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book{
	private int accessAge;
	
	public AniBook() {
		// TODO Auto-generated constructor stub
	}

	public AniBook(String title, String author, String publisher, int accesssAge) {
		super(title, author, publisher);
//		�θ� ������ ȣ��
		this.accessAge = accesssAge;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "/  accessAge  : " + accessAge;
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	
	
	
	
}
