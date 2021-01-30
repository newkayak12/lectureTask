package com.kh.practice.object_array.model.student.view;

import com.kh.practice.object_array.model.student.controller.StudentController;
import com.kh.practice.object_array.model.vo.Student;

public class StudentMenu {
	StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("====== 학생 정보 출력 ====== ");
		System.out.println(ssm.printStudent());
		System.out.println("\n====== 학생 성적 출력 ====== ");
		System.out.println(ssm.toString());
		System.out.println("\n====== 성적 결과 출력 ====== ");
			for(Student stu : ssm.getsArr() ) {
				if(stu.getScore()>=ssm.CUT_LINE) {
					System.out.println(stu.getName()+"은 통과입니다.");
				} else {
					System.out.println(stu.getName()+"은 재시험 대상입니다. ");
				}
			}
	}

}
