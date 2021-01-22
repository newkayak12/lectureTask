package com.practice.run;

import com.practice.controller.StudentController;
import com.practice.method.vo.Student;

public class Run2 {

	public static void main(String[] args) {
		StudentController stc = new StudentController();
		
		stc.insertStudent("kim", 2, 90, 80, 70);
		Student stu = new Student();
		int sum  = stu.korGetter()+stu.engGetter()+stu.mathGetter();
		double avg = sum/3;
	}

}
