package com.kh.test.switchcase;

import java.util.Scanner;

public class Test__4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("----------------");
		int s = 0;
		
		switch(age / 10) {
		case 7 : s += 15;
		case 6 : s += 20;
		case 5 : s += 30;
		case 4 : s += 15;
		case 3 : s += 20;
		case 2 : s += 25;
		case 1 : s += 15;
		break;
		}
		System.out.println("당신의 인생경험치는 " + s + "점입니다.");
	}

}
