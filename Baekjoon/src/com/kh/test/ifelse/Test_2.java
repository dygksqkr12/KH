package com.kh.test.ifelse;

import java.util.Scanner;

/**
 * 정수 한 개를 입력 받아 짝수면 “짝수다” 홀수면
 * “홀수다라고 출력하세요.
 *
 */
public class Test_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 1) {
			System.out.println("홀수다");
		} else{
			System.out.println("짝수다");
		}
	}

}
