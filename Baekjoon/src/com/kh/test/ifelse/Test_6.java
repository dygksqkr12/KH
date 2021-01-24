package com.kh.test.ifelse;

import java.util.Scanner;

public class Test_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~10 사이의 수를 입력하세요 : ");
		int n = sc.nextInt();
		
		if(n > 10 || n < 1) {
			System.out.println("1~10사이의 정수를 입력해야합니다.");
		}
		else if(n % 2 != 1) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	}

}
