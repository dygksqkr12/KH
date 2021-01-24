package com.kh.test;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 100 사이의 정수를 입력하세요 :");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 100) {
			
			if(num == 1) {
				System.out.println("1은 소수가 아닙니다.");
			}else {
				for(int i = 2; i < num; i++) {
					if(num % i == 0) {
						System.out.println(num + "은(는) 소수가 아닙니다.");
						return;
					}
				}
				System.out.println(num + "은(는) 소수입니다.");
			}
		}else {
			System.out.println("1부터 100 사이의 정수를 입력하세요!");
		}
		
	}

}
