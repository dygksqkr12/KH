package com.kh.test.ifelse;

import java.util.Scanner;

/**
 * 국어, 영어, 수학 점수를 입력 받아 합계, 평균을
 * 계산하고 합계가 250점 이상이면
 * “우수생입니다.”를 출력하는 코드를 작성하세요.
 */
public class Test_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int k = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int e = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int m = sc.nextInt();

		double d = (k + e + m) / 3;
		System.out.println(d);
		
		if(k + e + m >= 250) {
			System.out.println("우수생입니다.");
		}
	}

}
