package com.kh.score.view;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.score.controller.ScoreController;
import com.kh.score.model.dao.ScoreDAO;
//연속으로 쓰고 읽을 때 기존의 자료 안 읽어짐
public class ScoreMenu {
	Scanner scn = new Scanner(System.in);
	ScoreController sc = new ScoreController();
	public void mainMenu() {
		while(true) {
			System.out.println(" 1. 성적 저장");
			System.out.println(" 2. 성적 출력");
			System.out.println(" 9. 끝내기 ");
			System.out.print(">");
		int input = scn.nextInt();
			switch(input) {
			case 1:
				saveScore();
				break;
			case 2: 
				readScore();
				break;
			case 9: 
				System.out.println("terminateed");
				return;
			}
			
		}	
	}
	
	public void saveScore() {
		
		
			while(true) {
					System.out.print("이름 : ");
				String name  = scn.next();
					System.out.print("국어 : ");
				int kor = scn.nextInt();
					System.out.print("영어 : ");
				int eng = scn.nextInt();
					System.out.print("수학 : ");
				int math = scn.nextInt();
				
				int sum = kor + eng + math;
				double avg = (double) sum /3.0;
				
				sc.saveScore(name, kor, eng, math, sum, avg);
				System.out.println((ScoreDAO.num)+"번째 학생 입력이 끝났습니다.");
				
					System.out.println("계속 입력하시려면 아무키나 눌러주세요. 종료하려면 N 또는 n을 입력하세요");
				String conti = scn.next();
					switch(conti.toLowerCase()) {
						case "n" :
							return;
						default :
							
								
							
					}
			}
		
	}
	
	public void readScore() {
		
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			
			
			File count = new File("/Users/sanghyeonkim/Downloads/homework/tast02_08/src/com/kh/score/view/StudentData/data/count");
				try(FileInputStream thir = new FileInputStream(count);
						DataInputStream rs = new DataInputStream(thir);){
					if(count.exists()) {
						ScoreDAO.num = rs.readInt();
//						int temp = rs.readInt();
//						ScoreDAO.load = temp-(temp-1);
					
					}
				}catch(IOException e) {
					e.printStackTrace();
				}
			ScoreDAO.load=0;
			for(int i =0; i< ScoreDAO.num; i++) {
				try {
					sc.readScore();
				} catch ( FileNotFoundException e) {
					e.printStackTrace();
				}
				
			}
			
		System.out.println("---------------------");
		System.out.println("총 학생의 수 " + ScoreDAO.num+1);
		System.out.println("학생들의 총점 "+ScoreDAO.sumAll);
		System.out.println("학생들의 총 평균  "+(double)ScoreDAO.sumAll/(ScoreDAO.num*3));
	}
}
