package com.kh.test.ifelse;

import java.util.Scanner;

/**
 * A, B, C연봉을 입력하고 각 연봉을 입력하고 연
 * 봉이 5000이상이면 “0은 고액연봉자입니다”
 * 라고 출력하는 프로그램을 작성하세요.
 *
 */
public class Test_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연봉을 입력하세요 : ");
		int A = sc.nextInt();
		System.out.print("연봉을 입력하세요 : ");
		int B = sc.nextInt();
		System.out.print("연봉을 입력하세요 : ");
		int C = sc.nextInt();
		
		if(A >= 5000) {
			System.out.println("A는 고액연봉자입니다.");
		} 
		if(B >= 5000) {
			System.out.println("B는 고액연봉자입니다.");
		} 
		if(C >= 5000) {
			System.out.println("C는 고액연봉자입니다.");
		} 
	}

}
