package r_s_p;

import java.util.Scanner;

public class RockScissorPaper {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.print("게임을 시작하지...\n");
			System.out.println("\n\n가위!\n");
			System.out.println("바위!\n");
			System.out.println("보!\n");
			System.out.println("--------------");
			System.out.print("당신의 선택은?? ");
			System.out.println("1.가위 2.바위 3.보");
		int input = scn.nextInt();
		
		int random = (int) (Math.random()*3)+1;
		
			if(input==random) {
					if(input == 1) {
						System.out.println("컴퓨터는 가위를 냈습니다.");
						System.out.print("당신은 가위를 냈습니다. 결과적으로 ");
					} else if(input == 2) {
						System.out.println("컴퓨터는 바위를 냈습니다.");
						System.out.print("당신은 바위를 냈습니다. 결과적으로 ");
					} else if(input == 3) {
						System.out.println("컴퓨터는 보를 냈습니다.");
						System.out.print("당신은 보를 냈습니다. 결과적으로 ");
					}
					System.out.println("비겼습니다.");
					
					System.out.print("\n 다시 ");
				
			} else if( input ==1 ) {
				if(random ==2 ) {
					System.out.println("컴퓨터는 바위를 냈습니다.");
					System.out.println("당신은 가위를 냈습니다. 결과적으로 졌습니다.");
					System.out.print("다시 ");
				} else if( random ==3) {
					System.out.println("컴퓨터는 보를 냈습니다.");
					System.out.println("당신은 가위를 냈습니다. 결과적으로 이겼습니다.");
					System.out.print("다시 ");
				}
				
			} else if( input ==2 ) {
				if(random ==1) {
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("당신은 바위를 냈습니다. 결과적으로 이겼습니다.");
					System.out.print("다시 ");
				} else if( random == 3) {
					System.out.println("컴퓨터는 보를 냈습니다.");
					System.out.println("당신은 바위를 냈습니다. 결과적으로 졌습니다.");
					System.out.print("다시 ");
				}
				
			}else if(input ==3) {
				if(random ==1) {
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("당신은 보를 냈습니다. 결과적으로 졌습니다.");
					System.out.print("다시 ");
				}else if(random==2) {
					System.out.println("컴퓨터는 바위를 냈습니다.");
					System.out.println("당신은 보를 냈습니다. 결과적으로 이겼습니다.");
					System.out.print("다시 ");
				}
			}
		}
		
		
			
		
	}

}
