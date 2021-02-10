package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	Scanner scn = new Scanner(System.in);
	char cr = 13;
	FileController fc = new FileController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("***** My Note *****");
			
			System.out.println(" 1. new Note");
			System.out.println(" 2. open Note");
			System.out.println(" 3. Edit Note");
			System.out.println(" 9. terminate");
			System.out.print(">");
		int input = scn.nextInt();
			switch(input) {
				case 1:
					fileSave();
					break;
				case 2: 
					fileOpen();
					break;
					
				case 3: 
					fileEdit();
					break;
					
				case 9:
					
					return;
					
			}
		
		}
		
		
	}
	
	public void fileSave() {
		boolean run = true;
		boolean quit = true;
		String temp = "";
		String input = 	"";
		StringBuilder push = new StringBuilder(temp);
		
		while(run) {
		
			System.out.print("file name : ");
			String fileName = scn.next();
			boolean flag = fc.checkName(fileName);
			scn.nextLine();
				if(flag) {
						System.out.println("이미 파일이 존재합니다. 덮어 씁니까? 1.yes 2.no");
					int exist = scn.nextInt();
					if(exist == 1) {
						System.out.print(" enter :");
						scn.nextLine();
							while(quit) {
								input = scn.nextLine();
									if(input.equals("q")) {
										quit = false;
										run = false;
										
									} else {
										push.append(input);
										temp += push.toString();
										fc.fileSave(fileName, push);
									}
							
							}
							
					} else {
						System.out.print(" enter :");
						scn.nextLine();
							while(quit) {
								input = scn.nextLine();
									if(input.equals("q")) {
										quit = false;
										run = false;
										
									} else {
										push.append(input);
										temp += push.toString();
										fc.fileSave(fileName, push);
									}
							
							}
						
					}
				}	
		}
		
	}
	public void fileOpen() {
			System.out.print("file name : ");
		String fileName = scn.next();
		if(fc.checkName(fileName)){
			System.out.println(fc.fileOpen(fileName));
			
		} else {
			System.out.println("해당 파일이 없습니다.");
			
		}
	}
	
	public void fileEdit() {
		StringBuilder input = new StringBuilder("");
		boolean run = true;
			System.out.print("file name : ");
		String fileName = scn.next();
		scn.nextLine();
		if(fc.checkName(fileName)) {
			System.out.print(" enter :");
			while(run) {
				String enter = scn.next();
				input.append(enter);
				if(!enter.equals("q")) {
					fc.fileEdit(fileName, input);
				} else {
					run = false;
				}
				
				
			}
		} else {
			System.out.println("해당 파일이 없습니다.");
		}
	}
	
	
}
