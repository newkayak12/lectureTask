package com.kh.practice.object_array.model.student.controller;

import com.kh.practice.object_array.model.vo.Student;

public class StudentController {
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE =60;
	
	
	public StudentController() {
//		sArr[0].setName("김길동");
//		sArr[0].setSubject("자바");
//		sArr[0].setScore(100);
//		
//		sArr[1].setName("박길동");
//		sArr[1].setSubject("디비");
//		sArr[1].setScore(50);
//		
//		sArr[2].setName("이길동");
//		sArr[2].setSubject("화면");
//		sArr[2].setScore(85);
//		
//		sArr[3].setName("정길동");
//		sArr[3].setSubject("서버");
//		sArr[3].setScore(60);
//		
//		sArr[4].setName("홍길동");
//		sArr[4].setSubject("자바");
//		sArr[4].setScore(20);
		sArr[0]= new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	public Student[] getsArr() {
		return sArr;
	}

	public Student[] printStudent()	{
		
		
		
			return	sArr;
//		}
		
		 
	}
	
	public void setsArr(Student[] sArr) {
		this.sArr = sArr;
	}

	public int sumScore() {
		int total =0;
		for( Student stu : sArr) {
		 total +=stu.getScore();
		}
		return total;
	}
	public double[]	avgScore() {
		double[] avg = new double[2];
		avg[0] = sumScore();
		avg[1] = avg[0]/5;
		return avg;
	}
 
	@Override
	public String toString() {
		String result = "학생 평균 합계 : "+avgScore()[0]+"\n"+"학생 점수 평균 : "+avgScore()[1];
		return result;
	}
	
}
