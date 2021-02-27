package com.kh.practice.map.view;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	Scanner scn = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
			while(true) {
					System.out.println("**** main ****");
					System.out.println(" 1. 회원 가입");
					System.out.println(" 2. 로그인");
					System.out.println(" 3. 같은 이름 회원 찾기");
					System.out.println(" 9. 종료");
				int input = scn.nextInt();
					
					switch(input) {
						case 1:
							joinMembership();
							break;
						case 2: 
							login();
							break;
						case 3:
							sameName();
							break;
						case 9:
							System.out.println("terminated");
							return;
						default : 
							System.out.println("잘못 입력하였습니다. 다시 입력해 주세요");
					}
				
			}
	}
	
	public void memberMenu() {
			System.out.println("*** 회원 메뉴 ***");
			System.out.println(" 1. 비밀번호 바꾸기");
			System.out.println(" 2. 이름 바꾸기");
			System.out.println(" 3. 로그아웃");
		int input = scn.nextInt();
			switch(input) {
				case 1:
					changePassword();
					break;
				case 2: 
					changeName();
					break;
				case 3:
					System.out.println("로그 아웃 되었습니다.");
					return;
			}
	}
	
	public void joinMembership() {
			System.out.println("id : ");
		String id = scn.next();
			System.out.println("password : ");
		String pw = scn.next();
			System.out.println("name : ");
		String name = scn.next();
			Member login = new Member(pw, name);
			
			if(mc.joinMembership(id, login)) {
				System.out.println("성공적으로 회원 가입이 완료되었습니다.");
			} else {
				System.out.println("중복된 아이디 입니다. 다시 입력해주세요.");
			}
	}
	
	public void login()	{
		boolean flag = false;
		do {
				System.out.println(" id : ");
			String id = scn.next();
				System.out.println(" password : ");
			String pw = scn.next();
			String result = mc.login(id, pw);
				if(result != null) {
						System.out.println(result+ "님, 환영합니다.");
					memberMenu();
					flag = false;
				} else {
						System.out.println("틀린 아이디 또는 비밀번호 입니다. 다시 입력해주세요.");
					flag = true;
				}
		}while(flag);	
	}
	
	public void changePassword() {
		boolean flag = false;
			do {
					System.out.println(" id : ");
				String id = scn.next();
					System.out.println(" password : ");
				String pw = scn.next();
					System.out.println(" password to change : ");
				String pwNew = scn.next();
					if(mc.changePassword(id, pw, pwNew)) {
						System.out.println("비밀번호 변경에 성공했습니다.");
						flag = false;
					} else {
						System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요");
						flag = true;
					}
			}while(flag);
	}
	
	public void changeName() {
			System.out.println(" id : ");
		String id = scn.next();
			System.out.println(" newName : ");
		String pw = scn.next();
		String keytoName =	mc.login(id, pw);
	}
	
	
	
	
	public void sameName() {
			System.out.println(" name : ");
		String name = scn.next();
		
		mc.sameName(name);
		Set<Map.Entry<String, Member>> temp = mc.sameName(name).entrySet();
		
			for(Map.Entry<String, Member> piece : temp) {
				System.out.println(piece.getKey()+"-"+piece.getValue().getName());
				
			}
	}
	
}
