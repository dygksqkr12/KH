package com.kh.test.for_;

import java.util.Scanner;

public class Test__16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("T : ");
		int t = sc.nextInt();
		
		for (int i = 1; i <= t; i++) {
			System.out.println("A : ");
			int a = sc.nextInt();
			System.out.println("B : ");
			int b = sc.nextInt();
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " +(a + b));
		}
	}

}
