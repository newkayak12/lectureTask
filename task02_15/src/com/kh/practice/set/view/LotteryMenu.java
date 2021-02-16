package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	Scanner scn = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
			while(true) {
					System.out.println("*** 로또 추첨 프로그램 ***");
					System.out.println("  1. 추첨 대상 추가");
					System.out.println("  2. 추첨 대상 삭제");
					System.out.println("  3. 당첨 대상 확인");
					System.out.println("  4. 정렬된 당첨 대상 확인");
					System.out.println("  5. 당첨 대상 검색");
					System.out.println("  9. 종료");
				int input = scn.nextInt();
				
				
				
					switch(input) {
					 	case 1:
					 		insertObject();
					 		break;
					 	case 2: 
					 		deleteObject();
					 		break;
					 	case 3: 
					 		winObject();
					 		break;
					 	case 4:
					 		sortedWinObject();
					 		break;
					 	case 5:
					 		searchWinner();
					 		break;
					 	case 9: 
					 		System.out.println("프로그램 종료");
					 		return;
					}
			}
	}
	public void insertObject() {
			System.out.println("몇 명을 입력하시겠습니까?");
		int count = scn.nextInt();
			for(int i=0; i<count; i++) {
					System.out.println("이름");
				String name = scn.next();
					System.out.println("전화번호");
				String pNum = scn.next();
				
					if(!lc.insertObject(new Lottery(name, pNum))) {
						System.out.println("중복된 대상입니다. 다시 입력하세요");
					}
				
			}
			System.out.println("추가 완료되었습니다.");
	}
	
	public void deleteObject() {
		
			System.out.println("이름");
		String name = scn.next();
			System.out.println("전화번호");
		String pNum = scn.next();
		
		if(lc.deleteObject(new Lottery(name, pNum))) {
			System.out.println("삭제 완료 되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	
	public void winObject() {
		Iterator<Lottery> it = lc.winObject().iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	}
	public void sortedWinObject() {
		Iterator<Lottery> it = lc.SortedWinObject().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public void searchWinner() {
			System.out.println("이름");
		String name = scn.next();
			System.out.println("전화번호");
		String pNum = scn.next();
		
		if(lc.searchWinner(new Lottery(name, pNum))) {
			System.out.println("축하합니다. 당첨 목록에 있습니다.");
		} else {
			System.out.println("목록에 없습니다.");
		}
		
	}

}
