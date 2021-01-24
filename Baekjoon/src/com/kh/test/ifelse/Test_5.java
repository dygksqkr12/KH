package com.kh.test.ifelse;

import java.util.Scanner;

public class Test_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("연산자를 입력하세요 : ");
		char c = sc.next().charAt(0);
		
		if(num < 0 || num1 < 0) {
			System.out.println("음수를 입력하셨습니다. 프로그램을 종료합니다.");
		}
		else if(c != '+' && c != '-' && c != '*' && c != '/') {
			System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
		}
		else if(c == '+'){
			System.out.println("" + num + c + num1 + "= " + (num + num1));
		}
		else if(c == '-') {
			System.out.println("" + num + c + num1 + "= " + (num - num1));
		}
		else if(c == '*') {
			System.out.println("" + num + c + num1 + "= " + (num * num1));
		}
		else if(c == '/') {
			System.out.println("" + num + c + num1 + "= " + (num / num1));
		}
			
	}

}
