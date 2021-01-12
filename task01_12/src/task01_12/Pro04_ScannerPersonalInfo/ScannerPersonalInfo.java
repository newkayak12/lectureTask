package task01_12.Pro04_ScannerPersonalInfo;

import java.util.Scanner;

public class ScannerPersonalInfo {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String name, addr;
		char gen;
		int age;
		double hei,wei;
			System.out.print("your name? : ");
				name= scn.next();
			System.out.print("your age? : ");
				age=scn.nextInt();
			System.out.print("your address? : ");
				scn.nextLine();
				addr = scn.nextLine();
			System.out.print("your height? : ");
				hei = scn.nextDouble();
				int height = (int) hei;
			System.out.print("your weight? : ");
				wei = scn.nextDouble();
			System.out.print("your gender : ");
				gen = scn.next().charAt(0);
			System.out.printf(" name : %s \n age : %d\n address : %s\n height : %d\n weight : %.1f\n gender : %c\n", name, age, addr, height, wei, gen);
		
	}

}
