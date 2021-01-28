package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
//	 basic
		Book ar = new Book();  // obj 1
//	parameter 3
		Book ar2 = new Book("hound of Baskerville", "English", "Conan Doyle");  // obj 2
//	parameter 5
		Book ar3 = new Book("Cinderella", "english", "wilhelm Grimm", 9900, 5.0	); // obj 3
	
			ar.information();
			System.out.println("=========");
			ar2.information();
			System.out.println("=========");
			ar3.information();
			
			
			
			
	}
}
	
