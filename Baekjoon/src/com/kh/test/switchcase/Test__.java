package com.kh.test.switchcase;

import java.util.Scanner;

public class Test__ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*******초기 메뉴*******\n"
						+ "1. 입력\n"
						+ "2. 수정\n"
						+ "3. 조회\n"
						+ "4. 삭제\n"
						+ "0. 종료\n"
						+ "********************");
		int m = sc.nextInt();
		
		switch(m) {
		case 1 : System.out.println("입력메뉴선택");break;
		case 2 : System.out.println("수정메뉴선택");break;
		case 3 : System.out.println("조회메뉴선택");break;
		case 4 : System.out.println("삭제메뉴선택");break;
		case 0 : System.out.println("프로그램을 종료합니다.");break;
		default : System.out.println("번호를 잘못 누르셨습니다. 프로그램 종료합니다.");
		}
	}

}
