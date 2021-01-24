package com.kh.test.for_;

import java.util.Scanner;

public class Test__10 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("테스트 케이스 개수를 입력하세요 : ");
//		int t = sc.nextInt();
//		
//		for(int i=0;i<t;i++) {
//		System.out.print("A를 입력하세요 : ");
//		int A = sc.nextInt();
//		System.out.print("B를 입력하세요 : ");
//		int B = sc.nextInt();
//		System.out.println(A+B);
//		}
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("횟수 : ");
		int T = sc.nextInt();
		System.out.println(T);

		String num = "A 입력 : ";
		String num1 = "B 입력 : ";
		int A = 0;
		int B = 0;
		
		for(int sum = 1; sum <= T; sum++) {
			if(sum <= T) {
				System.out.print(num);
				A = sc.nextInt();
				System.out.print(num1);
				B = sc.nextInt();
				}
		}
		for (int i = 1; i <= T; i++) {
			System.out.println(A + B);
		}
//		System.out.print("A 입력 :");
//		System.out.print("B 입력 :");
		
	}

}
