package com.kh.test.for_;

import java.util.Scanner;

public class Test__12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 : ");
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			System.out.print("A 입력 : ");
			int A = sc.nextInt();
			System.out.print("B 입력 : ");
			int B = sc.nextInt();
			System.out.println(A + B);
		}
	}

}
