package com.kh.test.for_;

import java.util.Scanner;

public class Test__7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		String sum = "";
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				sum += "박";
			} 
			else if(i % 2 != 0) {
				sum += "수";
			}
		}
		System.out.println(num + "입력 : " + sum);
	}

}
