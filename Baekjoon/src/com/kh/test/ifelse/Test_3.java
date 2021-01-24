package com.kh.test.ifelse;

import java.util.Scanner;

/**
 * 국어(int), 영어(int), 수학(int) 점수를
정수형으로 입력 받아 총점(int)과
평균(double)을 계산하고 세 과목의 점수와
평균을 가지고 합격여부 처리, 세 과목 점수가 각각
40점 이상이면서, 평균이 60점 이상이면 합격,
아니면 불합격을 출력하는 프로그램을
작성하세요. 
 *
 */
public class Test_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요 : ");
		int k = sc.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		int e = sc.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		int m = sc.nextInt();
		
		double d = (k + e + m) / 3;
		System.out.println("평균 : " + d);
		
		if(k >= 40 && e >= 40 && m >= 40 && d >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
				
	}

}
