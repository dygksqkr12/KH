package com.kh.test.for_;

import java.util.Scanner;

public class Test__17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
