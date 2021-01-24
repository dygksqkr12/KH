package com.kh.test.for_;

import java.util.Scanner;

public class Test__8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("1~9단 선택 : ");
//		int num = sc.nextInt();
		
        System.out.print("단을 입력하세요(1~9) : ");
        int n = sc.nextInt();
        
        if(n>9||n<1) {
            System.out.println("잘못입력하셨습니다. 프로그램종료합니다.");
//            return;
        } else {
        	for(int i=1; i<=9;i++) {
        		System.out.println(n + " * " + i + " = " + (n * i));
        	}
        	
        }
        
    }

//		int sum = 0;
		
//		if(num < 1 || num > 9) {
//			System.out.println("잘못입력하셨습니다. 프로그램 종료합니다.");
//			return;
//		}
//		
//		for(int i = 1; i <= num; i++) {
//			if(i > num) {
//				break;
//			}
//			else if(i < 10) {
//				sum = i;
//			}
//			for(int j = 1; j < 10; j++) {
//				sum = i*j;
//				System.out.println(i + " * " + j + " = " + sum);
//			}
//	}
	}

