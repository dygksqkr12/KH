package com.kh.test.for_;

import java.util.Scanner;

public class Test__15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수 : ");
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			System.out.print("A : ");
			int A = sc.nextInt();
			System.out.print("B : ");
			int B = sc.nextInt();
			System.out.println("Case #" + i + ":" + (A + B));
		}
		
	}

}
