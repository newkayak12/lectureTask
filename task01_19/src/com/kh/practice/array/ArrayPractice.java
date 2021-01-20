package com.kh.practice.array;

import java.util.*;

public class ArrayPractice {
	Scanner scn = new Scanner(System.in);
	public void practice1() {
		int[] num = new int[10];
			for(int i =0; i<num.length; i++) {
				num[i]=i+1;
				System.out.print(num[i] + " ");
			}
			System.out.println();
			
			
	}
	
	
	
	
	public void practice2() {
		int[] num = new int[10];
		for(int i =num.length; i>0; i--) {
			num[num.length-1]=i;
			System.out.print(num[num.length-1] + " ");
		}
		System.out.println();
	}
	
	
	
	
	
	public void practice3() {
			System.out.print("Enter any number : ");
		int input = scn.nextInt();
		int[] num = new int [input];
			for(int i =0; i<num.length; i++) {
				num[i]=i+1;
				System.out.print(num[i]+" ");
			}
			System.out.println();
	}
	
	
	
	public void practice4() {
		String[] str = new String[5];
		str[0]="apple";
		str[1]="orange";
		str[2]="grape";
		str[3]="peach";
		str[4]="korean melon";
		
		System.out.println(str[1]);
	}
	
	public void practice5() {
			System.out.println("Enter any vocalubary : ");
		String str = scn.next();
			System.out.println("Enter to searching");
		char search = scn.next().charAt(0);
		char[] ch = new char[str.length()];
			for(int i =0; i<str.length(); i++) {
				ch[i]=str.charAt(i);
				if(ch[i]==search) {
					System.out.println("the location where "+search+" exist is " + i	);
				}
			}
	
	}
	
	
	public void practice6() {
		String[] days = {"월","화","수","목","금","토","일"} ;
			System.out.println("Enter any number in (0~6)");
		int input = scn.nextInt();
			try {
				if(input>=0||input<=6) {
					System.out.println(days[input]);
				} 
			
			
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid number!!!");
				return;
			}
				
		
	}
	
	
	
	public void practice7() {
			System.out.println("Enter any number to initialize : ");
		int init = scn.nextInt();
		int[] arr = new int[init];
		int result =0;
			for(int i=0; i<arr.length; i++) {
					System.out.println("Enter any number to allocate");
				int input = scn.nextInt();
				arr[i] = input;
				result += arr[i];
			}
		System.out.println(result);
	}
	
	
	public void practice8() {
			System.out.println("Enter any number : ");
		int input= scn.nextInt();
		int num =0;
			if(input>=3&&input%2==1) {
				int[] arr = new int[input];
					for(int i=0; i<arr.length; i++) {
						
						
						if(i<(input/2)+1) {
							num++;
							arr[i]=num;
							System.out.print(arr[i]+ " ");
							
						}else {
							num--;
							arr[i]=num;
							System.out.print(arr[i]+ " ");
							
							
						}
					}	
				
			} else {
				System.out.println("invalid nuber. try agin");
			}
	}
	
	
	
	
	
	
	public void practice9() {
		String[] chic = {"양념","후라이드","간장","허니"};
			System.out.println("enter searching keywords : ");
			boolean exist = false;
		String sear = scn.next();
			for(int i =0; i<chic.length; i++) {
				if(sear.equals(chic[i])) {
					System.out.println(chic[i]+ " can be delivered");
					exist = true;
					break;
				}
			}
			
			if(exist!=true) {
			System.out.println(sear + " is not exist");
			}
	}
			
	
	
	public void practice10() {
		char[] ssn = {'1','2','3','4','5','6','-','1','2','3','4','5','6','7',};
		char[] ssn2 = new char[ssn.length];
		System.arraycopy(ssn, 0, ssn2, 0, 8);
		 for(int i =0; i<8; i++) {
			 System.out.print(ssn2[i]);
		 }
		 for(int i=8; i<ssn2.length; i++) {
			 ssn2[i]='*';
				System.out.print(ssn2[8]);
		 }
		 
	}
	
	public void practice11() {
		int[] num=new int[10];
			for(int i=0; i<num.length;i++) {
				num[i]=(new Random().nextInt(10)+1);
				System.out.println(num[i]);
			}
	}
	
	public void practice12() {
		int[] num=new int[10];
			for(int i=0; i<num.length;i++) {
				num[i]=(new Random().nextInt(10)+1);
//					System.out.println(num[i]);
					for(int j=0; j<num.length; j++	) {
						
						
						if((i!=j)&&num[i]<num[j]) {
							int copy =num[i];
							num[i]=num[j];
							num[j]=copy;
							
							
						}
						
					}
			}
		
		
			System.out.println("smallest : " + num[0] + "\nlargest : "+num[9]);
	}
	
	
	public void practice13() {
		int[] num= new int[10];
			for(int i =0; i<num.length; i++){
				num[i] = (int)(Math.random()*10)+1;
//				num[i] = new Random().nextInt(10)+1;
				
					for(int j=0; j<i; j++) {
						
						
						if(num[i]==num[j]) {
//						if(num[i].equals(num[j])) {
							num[j] = (int)(Math.random()*10+1);
//							num[j] = new  Random().nextInt(10)+1;
//							랜덤 객체를 생성해서 비교하는건 의미가 없음
						}
					}
			}
			for(int i=0; i<num.length; i++) {
				System.out.println(num[i]);
			}
	}
//////////////////////////////////////////////////////////////	
	public void practice14() {
		
		/*
	}
		int[] num= new int[6];
		int copy=0;
		for(int i =0; i<num.length; i++){
			num[i] = (int)(Math.random()*45)+1;
				
		}
		
		for(int i =0; i<num.length; i++) {	
			for(int j=0; j<=i; j++) {
				if(i!=j&&num[i]==num[j]) {
					int hell = (int)(Math.random()*45+1);
					for(int t=0; t<i; t++) {
						if(num[i]==hell) {
							hell=(int)(Math.random()*45+1);
							num[j]=hell;
						}
					}
					
				}
				
		}
			
		
			System.out.println(num[i]+ "\n");
	}
		*/
		
		
		int num[] = new int[6];
//		로또 6자리 생성
			for (int i =0; i<num.length; i++) {
//			첫번째 for생성, 여기서는 로또 번호를 생성 받을 거임
				num[i]	=(int) (Math.random()*45)+1;
//				로또 번호 난수 생성 45까지 나오게
//				System.out.println(num[i]);
//				생성 완료/ 값이 중복
			}
			
			for(int i =0; i<num.length; i++) {
				for(int j =0; j<num.length; j++) {
//					비교할 for 두 개 생성
//					i랑 j가 같으면 비교할 가치가 없고/ num[i]랑 num[j]가 같을 경우 값 재생성
						if((i!=j)&&num[i]==num[j]) {
							num[j]=(int) (Math.random()*45)+1;
						}
				}
//				System.out.println(num[i]+"\n\n");
//				10번 실행 결과 중복 값 없음 이건 만약 중복되면 내가 로또사는게 맞다.
			}
			
//			오름차순으로 정렬 시작
			for(int i=0; i<num.length; i++) {
				for(int j=0; j<num.length; j++) {
					if((i!=j)&&num[i]<num[j]) {
						int copy2 = num[i];
						num[i]=num[j];
						num[j]=copy2;
					}
				}
					
					
			}
			
			for(int i=0; i<num.length; i++) {
				System.out.println(num[i]);
			}
//출력은 하나의 for에서 하니까 예상하던거랑 다르게 움직였네
//			아.. 이렇게 복잡하게 쓰고 싶지는 않은데...;;
		
	}
//	아니 어떻게 새로 뽑는 걸 세 번을 돌렸는데도 똑같은 수가 나와?
	
	
	
	
//////////////////////////////////////////////////////	
	
	
	
	
	public void practice15() {
			System.out.println("Enter any keyword : ");
		String str = scn.next();
		System.out.print("character : ");
		char[] ch = new char[str.length()];
			for(int i=0; i<str.length(); i++) {
				ch[i] = str.charAt(i);
				System.out.print(ch[i]+" ");
			}
			System.out.println("\nnumber of letters : " + str.length());
			
	}
	
///////////////////////////////////////////////////////////	
	
	public void practice16() {
//			System.out.println("number : ");
//		int init = scn.nextInt();
//		String[] str = new String[init];
//		String[] str2= {};
//		boolean run = false;
//		boolean change =true;
//		
//			for(int i=0; i<str.length; i++) {
//				System.out.println("enter words");
//				String initi = scn.next();
//				str[i]= initi;
//			}
//			do {
//					System.out.println("add? (1. yes/ 2. no)");
//				int ask = scn.nextInt();
//				
//				if(ask==1) {
//					run =true;
//				} else { run =false;}
//main:			while(run) {
//					
//					if(change==true) {
//							System.out.println("number : ");
//						ask = scn.nextInt()+init;
//						str2= new String[ask];
//						System.arraycopy(str, 0, str2, 0, str2.length);
//						change = false;
//						break main;
//						
//						
//					} else if(change!=true) {
//						
//						System.out.println("number : ");
//						int ask2 = scn.nextInt()+ask;
//						str= new String[ask2];
//						System.arraycopy(str2, 0, str, 0, str.length);
//						change = true;
//						break main;
//					}
//					
//					
//				}
//			}while(run);
		
		
		
//		버퍼쓰는게 나은거 아니야??
//		객체 한 번 생성하면 수정이 안되는 걸로 알고 있는데
//		결국 새로운 객체에 복사해서 집어 넣고
//		나머지 공간에 추가하라는 소린데
//		yes no로 선택해서 계속 반복시켜야되니까 do-while을 써야겠고
		
//		 목표 : 배열 객체 2개만 사용하기
			System.out.println("Number : ");
		int num = scn.nextInt();
		boolean run = true; 
		String[] str= new String[num];
		for(int i=0; i<str.length; i++){
			System.out.println("Enter vocabulary");
		String input = scn.next();
		str[i] = input;
//		System.out.println("0:" + str[0]); // 값 손실 체크
	}
		
	do {
			
//	배열 초기화 완료 추가 작업 여부 질문
			System.out.println("continue? 1.yes/2.no");
			num = scn.nextInt();
			
			if(num==2) {
				run =false;
					System.out.println("terminated");
					break;
					
			} else if (num==1) {
//					System.out.println("**"+str.length); //객체의 수 체크
					System.out.println("how many times do you insert");
				int add =scn.nextInt();
				String[] temp = new String[str.length+add];
//					System.out.println("***"+temp.length);//객체의 수 체크
//				새로운 객체 생성
					
					
//					System.out.println("1:"+str[0]); // 두 번째 값 체크
				for(int i=0; i<str.length; i++) {
					temp[i] =str[i];
					
				}
//					System.out.println("2_temp:"+temp[0]); // 세 번째 값 체크
//					System.out.println("2_str:"+str[0]); // 세 번째 값 체크
//				복사(1차)
				
				for(int i= ((temp.length)-(str.length)); i<temp.length; i++) {
						System.out.println("Enter vocabulary");
					temp[i]=scn.next();
				}
//				System.out.println("3_temp:"+temp[0]); // 네 번째 값 체크
//				System.out.println("3_str:"+str[0]); // 네 번째 값 체크
				
//				추가 배열 받기
				
					System.out.print("[");
					str =new String[temp.length];
				for(int i=0; i<temp.length; i++) {
					str[i] = temp[i];
					
					 System.out.print(str[i]+" ");
					 
//					 System.out.println("4_temp:"+temp[0]); // 다섯 번째 값 체크
//						System.out.println("4_str:"+str[0]); // 다섯 번째 값 체크
				}
				System.out.print("]");
//				반복을 위해서 str로 모든 값 이전
				System.out.println();
//				System.out.println(str[0]);
				
//				 여기서 객체가 손상되네
			}
	}while(run);
	
	}
	
}
