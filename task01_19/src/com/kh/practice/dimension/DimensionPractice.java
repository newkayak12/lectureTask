package com.kh.practice.dimension;

import java.util.Scanner;



public class DimensionPractice {
	Scanner scn = new Scanner(System.in);
	
	public void practice1() {
		String[][] str= new String[3][3]; 
			for(int i =0; i<str.length; i++ ) {
				for(int j =0; j<str[i].length; j++) {
					str[i][j]="("+i+" , "+j+")";
					System.out.print(str[i][j]);
				}
				System.out.println();
			}
	}
	
	
	public void practice2() {
		int[][] tni = new int[4][4];
		int input=1;
			for(int i=0; i<tni.length; i++ ) {
				for(int j=0; j<tni[i].length; j++) {
					tni[i][j]=input;
						if(input<10) {
							System.out.print("0");
						}
					System.out.print(tni[i][j]+" ");
					
					input++;
				}
				System.out.println();
			}
	}
	
	
	public void practice3() {
		int[][] tni = new int[4][4];
		int input=16;
			for(int i=0; i<tni.length; i++ ) {
				for(int j=0; j<tni[i].length; j++) {
					tni[i][j]=input;
						if(input<10) {
							System.out.print("0");
						}
					System.out.print(tni[i][j]+" ");
					
					input--;
				}
				System.out.println();
			}
	}
	
	
	
	public void practice4() {
		int[][] tni = new int[4][4];
			for(int i =0; i<tni.length; i++) {
				for(int j=0; j<tni[i].length; j++) {
					if((i==3)&&(j==3)) {
						tni[3][3] =tni[0][3]+tni[1][3]+tni[2][3]+tni[3][0]+tni[3][1]+tni[3][2];
						System.out.println(tni[3][3]);
					}else if (j==3) {
						if(i==0) {
						tni[0][3]=tni[0][0]+tni[0][1]+tni[0][2];
						System.out.print(tni[0][3]);
						} else if(i==1) {
							tni[1][3]=tni[1][0]+tni[1][1]+tni[1][2];
							System.out.print(tni[1][3]);
						} else if(i==2) {
							tni[2][3]=tni[2][0]+tni[2][1]+tni[2][2];
							System.out.print(tni[2][3]);
						}
					}else if(i==3) {
						if(j==0) {
								tni[3][0]=tni[0][0]+tni[1][0]+tni[2][0];
									System.out.print(tni[3][0]+ " ");
							} else if(j==1) {
								tni[3][1]=tni[0][1]+tni[1][1]+tni[2][1];
									System.out.print(tni[3][1]+" ");
							} else if(j==2) {
								tni[3][2]=tni[0][2]+tni[1][2]+tni[2][2];
								System.out.print(tni[3][2]+" ");
							}
						
						
						
					}else {
						
						tni[i][j]= (int)(Math.random()*10)+1;
						if(tni[i][j]<10&&(i!=3||j!=3)) {
							System.out.print("0");
						}
						System.out.print(tni[i][j]+" ");
						
					}
						
				}
				System.out.println();
			}
			
			//이건 풀어도 푼게 아니다.
		
	}
	public void practice5() {
			System.out.println("number");
		int fir = scn.nextInt();
			System.out.println("number");
		int sec = scn.nextInt();
		
		int[][] num = new int[fir][sec];
		for(int i =0; i<num.length; i++) {
				for(int j=0; j<num[i].length; j++) {
					num[i][j]=(int)(Math.random()*25)+66;
					System.out.print((char)num[i][j]);
				}
				System.out.println();
			
		}
	}
	
	public void practice6() {
		String[][] strArr =new String[][] {{"이","까","왔","앞","힘"},{"차","지","습","으","냅"},{"원","열","니","로","시"},{"배","심","다","좀","다"},{"열","히","!","더","!!"}};
			for(int i =0; i<strArr.length; i++) {
				for( int j=0; j<strArr[i].length; j++) {
					System.out.print(strArr[j][i]);
				}
				System.out.println();
			}
		
	}
	
	
	public void practice7() {
			System.out.println("number");
		int ls=scn.nextInt();
		char[][] arr= new char[ls][];
		int k =0;
			for(int i=0; i<arr.length; i++) {
					System.out.println("number");
				int ls2=scn.nextInt();
				arr[i]= new char [ls2];
			}
			
			for(int i =0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
						System.out.println("enter any letter");
					char ch = scn.next().charAt(0);
					arr[i][j]=ch;
					
				}
			}
			for(int i =0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]);
				}
			System.out.println();
			}
		
		
	}
		
	
	public void practice8() {
		String[] name= {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주",  "차천축", "피풍표", "홍하하"};
		int count =0;
			for(int i =1; i<=2; i++) {
				System.out.println("== division "+i+" ==");
					if(count<name.length/2) {
						for(int j=count; j<name.length/2; j++) {
	//							for(int k=0; k<2; k++) {
									
									System.out.print(name[j]+"   ");
	//							}
									if(count%2==1) {
										System.out.println();
									}
								count++;
						}
					} else {
						for(int j=count; j<name.length; j++) {
	//							for(int k=0; k<2; k++) {
									
									System.out.print(name[j]+"   ");
	//							}
									if(count%2==1) {
										System.out.println();
									}
								count++;
						}
					}	
						
			}
	}
	
	
	
	public void practice9() {
		
		String[] name= {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주",  "차천축", "피풍표", "홍하하"};
		String arr[][]= new String [6][2];
		int count =0;
		int print =0;
	
			for(int i=0; i<arr.length; i++) {
				for(int k=0; k<arr[i].length; k++) {
					arr[i][k]=name[count];
					count++;
//					System.out.print(arr[i][k]+" ");
				}
//				System.out.println();
			}
//			
//			for(int i=0; i<arr.length; i++) {
//				for(int k=0; k<arr[i].length; k++) {
//					System.out.println(arr[i][k]);
//				}
//			}
//				// 1차원 배열을 2차원 배열로 넣는다...
		
			for(int l =1; l<=2; l++) {
				if(print<6) {
					System.out.println("==division"+l+"==");
					for(int i=0; i<arr.length/2; i++) {
						for(int k=0; k<arr[i].length; k++) {
							print++;
							System.out.print(arr[i][k]+" ");
						}
						System.out.println();
					}
				} else if(print>=6) {
					System.out.println("==division"+l+"==");
					for(int i=arr.length/2; i<arr.length; i++) {
						for(int k=0; k<arr[i].length; k++) {
							print++;
							System.out.print(arr[i][k]+" ");
						}
						System.out.println();
					}
				}
			}
			
			
			
			
			System.out.println("===================");
			System.out.println("search : ");
			String sear = scn.next();
			for(int i=0; i<arr.length; i++) {
					for(int j =0; j<arr[i].length; j++) {
						if(sear.equals(arr[i][j])) {
							if(i<3) {
								System.out.print(sear+"는 첫 번째 분단 "+(i+1)+" 번째 줄 ");
								if(j==0) {
									System.out.println("왼쪽에 있습니다.");
								}else {
									System.out.println("오른쪽에 있습니다.");
								}
							} else if( i>=3) {
								System.out.print(sear+"는 두 번째 분단 "+(i-2)+" 번째 줄 ");
								if(j==0) {
									System.out.println("왼쪽에 있습니다.");
								}else {
									System.out.println("오른쪽에 있습니다.");
								}
								
							}
						}
					}
			}
					
//					뭐야....?
//			디지는줄 알았네...
				
			
	}
	
}
