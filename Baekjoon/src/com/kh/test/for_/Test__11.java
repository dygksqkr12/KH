package com.kh.test.for_;

import java.util.Scanner;

public class Test__11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
