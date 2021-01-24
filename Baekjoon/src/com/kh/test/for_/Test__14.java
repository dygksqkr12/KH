package com.kh.test.for_;

import java.util.Scanner;

public class Test__14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println(n-i);
		}
	}

}
