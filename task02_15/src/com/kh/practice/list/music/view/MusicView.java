package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	Scanner scn = new Scanner(System.in);
	
	MusicController mc = new MusicController();
	
	
	public void MainMenu() {
		
		while(true) {
				System.out.println("*********** 메인 메뉴 ***********");
				System.out.println("    1. 마지막 위치에 첫 곡 추가");
				System.out.println("    2. 첫 위치에 첫 곡 추가");
				System.out.println("    3. 전체 곡 목록 출력");
				System.out.println("    4. 특정 곡 검색");
				System.out.println("    5. 특정 곡 삭제");
				System.out.println("    6. 특정 곡 정보 수정");
				System.out.println("    7. 곡명 오름차순 정렬");
				System.out.println("    8. 가수명 내림차순 정렬");
				System.out.println("    9. 종료");
			int input = scn.nextInt();
			
				switch(input) {
					case 1 : 
						addList();
							break;
					case 2 : 
						addAtZero();
							break;
					case 3 : 
						printAll();
							break;
					case 4 : 
						searchMusic();
							break;
					case 5 :
						removeMusic();
							break;
					case 6 :
						setMusic();
							break;
					case 7 :
						ascTitle();
							break;
					case 8 :
						descSinger();
							break;
					case 9 : 
						return;
						
					
				}
			
		}
	}
	
	


	public void addList() {
			System.out.println("곡 명 : ");
		String title = scn.next();
			System.out.println("아티스트 명: ");
		String singer = scn.next();
		Music temp = new Music (title, singer);
		if(	mc.addList(temp) ==1 ) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
			
	}
	
	public void addAtZero() {
		System.out.println("곡 명 : ");
		String title = scn.next();
			System.out.println("아티스트 명: ");
		String singer = scn.next();
		Music temp = new Music (title, singer);
		if(	mc.addList(temp) ==1 ) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}
	
	public void printAll() {
		for( int i =0; i< mc.printAll().size(); i++) {
			System.out.println(mc.printAll().get(i));
		}
		
	}
	
	public void searchMusic() {
			System.out.println("곡 명 : ");
		String title = scn.next();
			if( mc.searchMsuic(title) != null ) {
				System.out.println("검색한 곡은 "+ mc.searchMsuic(title).getSinger()
				+ "님의  " + mc.searchMsuic(title).getTitle()+"입니다. ");
			} else {
				System.out.println("검색한 곡이 없습니다.");
			}
		
	}
	
	public void removeMusic() {
		System.out.println("곡 명 : ");
		String title = scn.next();
			if( mc.removeMusic(title) != null ) {
				
				
				System.out.println("가수명 "+ mc.searchMsuic(title).getSinger()
				+ "곡 명 " + mc.searchMsuic(title).getTitle()+"인 곡을 삭제했습니다. ");
				mc.getList().remove(mc.removeMusic(title));
			} else {
				System.out.println("삭제할 곡이 없습니다.");
			}
		
	}
	
	public void setMusic() {
			System.out.println("곡 명 : ");
		String title = scn.next();
			System.out.println("아티스트 명 : ");
		String singer = scn.next();
		
			if(mc.setMusic(title, new Music(title,singer)) != null) {
				System.out.println("정보를 수정했습니다.");
			} else {
				System.out.println("수정할 곡이 없습니다.");
			}
		
	}
	
	public void ascTitle() {
		if(mc.ascTitle() ==1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
		
	}
	
	public void descSinger() {
		
if(mc.descSinger() ==1) {	
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
		

		
	}
}
