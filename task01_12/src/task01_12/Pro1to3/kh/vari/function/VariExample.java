package task01_12.Pro1to3.kh.vari.function;

import java.util.Scanner;

public class VariExample {
	public void Calc() {
		Scanner scn = new Scanner(System.in);
		int fr, en, res;
		String oper, input;
		boolean run = true;
		double resu;
		
		System.out.println("-----------------Calculator----------------------");
		System.out.println("첫번쨰 숫자, 연산자, 마지막 숫자를 칠 때마다 엔터를 눌러주세요. ");
		System.out.println("    숫자는 모두 정수로 입력하셔야 정상 작동합니다. ");
		do {
			fr= scn.nextInt();
			oper = scn.next();
			en= scn.nextInt();
				if(oper.equals("+")) {
					res=fr+en;
					System.out.print(fr+" + "+en+ " = " + res);
				} else if (oper.equals("-")) {
					res=fr-en;
					System.out.print(fr+" - "+en+ " = " + res);
				} else if (oper.equals("*")) {
					res=fr*en;
					System.out.print(fr+" ｘ "+en+ " = " + res);
				} else if (oper.equals("/")) {
					resu = (double)fr/en;
					System.out.print(fr+" ÷ "+en+ " = " + resu);
					
				}
			System.out.println();
			System.out.print("다시 계산 하기겠습니까? y/n");
			input = scn.next();
			if(input.equals("y")) {
				run =true;
			} else if (input.equals("n")) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}
			
		}while(run);
	}
	
	public void rectang( ) {
		int line, hei;
		Scanner scn = new Scanner(System.in);
		System.out.println("1. 둘레 계산 2. 넓이 계산");
		System.out.print(" > ");
		int input = scn.nextInt();
		System.out.print("사각형의 가로의 길이는? :");
		line= scn.nextInt();
		System.out.print("사각형의 세로의 길이는? :");
		hei= scn.nextInt();
		switch (input) {
		
		case 1:
			System.out.println("사각형의 둘레는 " + ((line+hei)*2) + "입니다.");
			break;
		case 2: 
			System.out.println("사각형의 넓이는 " + (line*hei) + "입니다.");

		}
	}
	
	public void charac() {
		Scanner scn = new Scanner(System.in);
		String str;
		System.out.println("해부할 글자를 입력하세요");
		System.out.print(">");
		str = scn.next();
		System.out.println("글자를 해부합니다.");
		for(int i =0; i<str.length(); i++  ) {
			if(str.charAt(i)!=0) {
				System.out.println(str.charAt(i));
			
			} else if(str.charAt(i)==0){
				System.out.println("끝!");
				break;
			
			}
			}
	}
		
	public void isItlarger( ) {
		Scanner scn = new Scanner(System.in);
		System.out.print("비교할 정수를 입력하세요 : ");
		int num = scn.nextInt();
		int oppo = 20;
		if(num>oppo) {
			System.out.println("이 수는 20보다 큽니다.");
		} else if (num<oppo) {
			System.out.println("이 수는 20보다 작습니다.");
		} else if( num == oppo) {
			System.out.println("이 수는 20입니다.");
		}
	}
	
	
	public void isItUpperCaseLetter( ) {
		Scanner scn = new Scanner(System.in);
		System.out.println("대문자인지 검증할 문자를 넣으십시오 _ 단 영문만 가능합니다!");
		char ch = scn.next().charAt(0);
		if(ch>64 && 90>ch) {
			System.out.println("대문자입니다.");
		}else {
			System.out.println("대문자가 아니거나 특수기호 입니다.");
		}
		
	}
}
	
	
