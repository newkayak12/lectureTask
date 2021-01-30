package com.oop.controller;

import com.oop.model.dto.Employee;

public class EmpArrayTest {
	public static void main (String [] args) {
		
		
		Employee[] employee = new Employee[3];
		double sal =0.0;
		double total =0.0;
		
		employee[0] = new Employee();
		employee[1] = new Employee(201503, "박길동", null, null, 29, 'M', 0, 0, "010-1234-5678", "경기도 의정부시");
		employee[2] = new Employee(201004,"김첧수", "개발부", "과장", 34, 'M', 4500000, 0.15, "010-2143-9876","서울시 노원구 노원동 123");
			for(Employee emp : employee) {
				System.out.println(emp.empInformation());
			}
			
		employee[0]	= new Employee(201305, "이영희", "총무부", "대리", 28, 'F', 3750000, 0.1, "010-9512-7534", "경기도 동두천");
		employee[1].setDept("기획부");
		employee[1].setJob("사원");
		employee[1].setSalary(2900000);
		employee[1].setBonusPoint(0.05);
			for( int i = 0; i<employee.length; i++) {
				 sal = ( employee[i].getSalary()  * 
						(1.0+ employee[i].getBonusPoint() )
						*12);
				System.out.println(employee[i].getEmpName() + "의 연봉 : " + sal );
				total+=sal;
			}
			System.out.println("직원들의 연봉의 평균 : " +  total/3);
		
		
	}
}
