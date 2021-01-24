package com.kh.test.for_;

import java.util.Scanner;

public class Test__9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 9) {
			for(int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i)); 
		}
		} else {
			System.out.println("잘못입력");
			
		}
	}

}
