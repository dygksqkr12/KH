package com.kh.test.for_;

import java.util.Scanner;

public class Test___ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A : ");
		int a = sc.nextInt();
		System.out.println("X : ");
		int x = sc.nextInt();
		int num = 0;
		String sum = "";
		for (int i = 1; i <= a; i++) {
			System.out.println("입력 : ");
			num = sc.nextInt();
			if(num < x) {
				sum += num + " ";
			}
		}
		System.out.println(sum);
	}
	}


