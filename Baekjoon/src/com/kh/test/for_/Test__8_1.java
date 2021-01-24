package com.kh.test.for_;

import java.util.Scanner;

public class Test__8_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9 입력 : ");
		int dan = sc.nextInt();
		if(dan < 1 || dan > 9) {
			System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
		} else {
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		}
	}

}
