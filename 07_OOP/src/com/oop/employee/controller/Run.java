package com.oop.employee.controller;

import com.oop.employee.model.vo.Employee;

public class Run {
	
	public static void main(String[] args) {
		Employee ep = new Employee();
		ep.printEmployee();
		
		Employee ep1 = new Employee(1, "홍길동", '남', "010-1234-5678");
		ep1.printEmployee();
		
		Employee ep2 = new Employee(2, "유관순", '여', "010-3131-3131", "영업부", 3000000, 0.15);
		ep2.printEmployee();
		
	}

}
