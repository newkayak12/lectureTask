package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book ar = new Book();
		Book ar2 = new Book("hound of Baskerville", "English", "Conan Doyle");
		Book ar3 = new Book("Cinderella", "english", "wilhelm Grimm", 9900, 5.0	);
	
			ar.information();
			System.out.println("=========");
			ar2.information();
			System.out.println("=========");
			ar3.information();
	}
}
	
