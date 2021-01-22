package com.practice.controller;

import com.practice.method.vo.Student;

public class StudentController {
	public void insertStudent(String name, int grade, int kor, int eng, int math) {
		Student stu = new Student();
		stu.nameSetter(name);
		stu.gradeSetter(grade);
		stu.korSetter(kor);
		stu.engSetter(eng);
		stu.mathSetter(math);
	}
}
