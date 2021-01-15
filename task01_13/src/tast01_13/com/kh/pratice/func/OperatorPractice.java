package tast01_13.com.kh.pratice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner scn = new Scanner(System.in);
	public void practice1() {
			System.out.print("input number : ");
		int num = scn.nextInt();
		String result = ( (num > 0)? "양수이다." : "양수가 아니다.");
			System.out.println(result);
	}
	
	public void practice2() {
				System.out.print("input number : ");
			int num = scn.nextInt();
			String result = ( (num > 0)? "양수이다." : ( num == 0 )? " 0이다. " : " 음수이다. " );
				System.out.println(result);
	}
	
	
	
	public void practice3() {
			System.out.print("input number : ");
		int num = scn.nextInt();
		String result = ( (num%2 == 0 )? " 짝수이다. " : " 홀수이다. " );
			System.out.println(result);
	}

	public void practice4() {
			System.out.print(" How many people they are? : ");
		int num = scn.nextInt();
			System.out.print(" How many candies ? : ");
		int pnum = scn.nextInt();
		int share = pnum/num;
		int theRest = pnum%num;
			System.out.println( "share : " + share);
			System.out.println( " The rest : " + theRest);
	}

	public void practice5() {
			System.out.print("name? :");
		String name = scn.next();
			System.out.print("grade? :");
		int gra = scn.nextInt();
			System.out.print("class? :");
		int cla = scn.nextInt();
			System.out.print("number of you? :");
		int no = scn.nextInt();
			System.out.print("gender? (남/여) : ");
		char gen = scn.next().charAt(0);
			System.out.print("score? :");
		double sco = scn.nextDouble();
		
			System.out.printf("%d학년 %d반 %s %c학생의 성적은 %.2f이다. \n", gra, cla, name, gen, sco	);
	}
	
	public void practice6() {
			System.out.print("input your age : ");
		int age = scn.nextInt();
		String result = ( ( age>13 && age <= 19 )? "청소년" : ( age > 19 )? "성인" : "어린이" );
			System.out.println(result);
	}
	
	public void practice7 () {
			System.out.print("your score of korean ?");
		int kor = scn.nextInt();
			System.out.print("your score of english ?");
		int eng = scn.nextInt();
			System.out.print("your score of mathmatics ?");
		int math = scn.nextInt();
		int sum = kor + eng + math;
		double avg =  (double) sum/3;
			System.out.println("sum : " + sum);
			System.out.println("avf : " +avg);
		String result = ( ( ((kor>=40) && (eng>=40) && (math>=40)) && (avg>=60) )? "합격" : "불합격" );
			System.out.println(result);
	}
	
	public void practice8( ) {
			System.out.print("input your ssn (enter ssn with '-') : ");
		char ssn = scn.next().charAt(7);
		String result = ( ( ssn == 1 )? "남자":"여자");
			System.out.println(result);
	}
	
	public void practice9() {
			System.out.print("enter any number (only value of integer) : ");
		int fir = scn.nextInt();
			System.out.print("enter any number agin (only value of integer and you should enter the value smaller than first one) : ");
		int sec = scn.nextInt();
			System.out.print("enter any number lastly (only value of integer) : ");
		int thi = scn.nextInt();
			
		String result = ( ((thi<=fir) || (thi>sec) )? "true" : "false" ); 
			System.out.println(result);
	
	}
	
	public void practice10() {
			System.out.print("enter any number : ");
		int fir = scn.nextInt();
			System.out.print("enter any number : ");
		int sec = scn.nextInt();
			System.out.print("enter any number : ");
		int thi = scn.nextInt();
		
		String result = ( (fir == sec) && ( sec == thi )? "true" : "false" );
			System.out.println(result);
	}
	
	public void practice11() {
			System.out.print("enter your annual income : ");
		int A = scn.nextInt();
			System.out.print("enter your annual income : ");
		int B = scn.nextInt();
			System.out.print("enter your annual income : ");
		int C = scn.nextInt();
		
		
		double incenA = A*(1.4);
		double incenB = B*(1);
		double incenC = C*(1.15);
		
			System.out.print("annual income of A with incentive : " + A+"/"+incenA);
		String resA = ( (incenA >= 3000 )? "more than 3000" : "less than 3000");
			System.out.println(" and it is " + resA);
			
			System.out.print("annual income of B with incentive : " + B+"/"+incenB);
		String resB = ( (incenB >= 3000 )? "more than 3000" : "less than 3000");
			System.out.println(" and it is " + resB);
			
			System.out.print("annual income of C with incentive : " + C+"/"+incenC);
		String resC = ( (incenC >= 3000 )? "more than 3000" : "less than 3000");
			System.out.println(" and it is " + resC);	
			System.out.println("test");
			System.out.printf("%f", incenC);
	}
	
	
}


