package com.kh.test.ifelse;

import java.util.Scanner;

public class Test_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요 : ");
		int cm = sc.nextInt();
		System.out.print("몸무게를 입력하세요 :");
		int kg = sc.nextInt();
		System.out.println("-----------------------");
		double d = (cm - 100) * 0.9;
		System.out.println("표준체중은 " + d + "kg입니다.");
		
		if(kg > (d + 1)) {
			System.out.println("고로 당신은 과체중입니다.");
		}
		else if(kg < (d - 1)) {
			System.out.println("고로 당신은 저체중입니다.");
		}else {
			System.out.println("고로 당신은 정상체중입니다.");
		}
	}

}
