package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];
	private int count =0;
	//member
	

	{
		bList[0] = new CookBook("���� �鼱��", "������", "tvN", true);
		bList[1] = new AniBook("�� �� �� �ؿ�", "��Ƽ", "�����", 19	);
		bList[2] = new AniBook("���ǽ�", "���� ����ġ��", "Toei", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�?", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұݺϽ�", true);
	};
	// init block
	
	
	

	public Book[] getbList() {
		return bList;
	}
	
	public int getCount() {
		return count;
	}

	
	//getter
	
	
	
	public void insertMemeber(Member mem) {
		this.mem = mem;
	}
	
	public Member myinfo() {
		
		
		return mem;
	}
	
	public Book[] selectAll() {
		
		
		return bList;
	}
	
	
	

	public Book[] searchBook(String keyword) {
		Book[] searchResult = new Book[5];
		
			for(int i =0; i<bList.length; i++) {
				String title = bList[i].getTitle();
					if(title.contains(keyword)) {
						if(searchResult[i]==null) {
//							count++;
							searchResult[i] = bList[i];
						}
	//					searchResult will have bList object in condition, if bList's title contains keyword
	//					and this method return searchResult 
	//					<searchResult might be had null so this point is important>
						
						
					}
				
			}
		return searchResult;
	}
	
	public int rentBook(int index) {
		int result =0;
			if(bList[index -1] instanceof AniBook) {
				AniBook search = (AniBook)	bList[index -1];
					if(mem.getAge()<search.getAccessAge()) {
						result = 1;
					}
			} else if (bList[index -1] instanceof CookBook) {
				CookBook search = (CookBook) bList[index -1];
					if(search.isCoupon() == true) {
						mem.setCouponCount(mem.getCouponCount()+1);
						result = 2; 
					}
			}
		return result;
	}
	
	
	

	
}
