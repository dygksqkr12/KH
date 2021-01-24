package com.kh.test.ifelse;

import java.util.Scanner;

public class Test_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요 : ");
		double cm = sc.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / ((cm/100) * (cm/100));
		
		if(bmi < 18.5) {
			System.out.println("당신의 BMI는 " + bmi + "입니다. 저체중 입니다.");
		}
		else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("당신의 BMI는 " + bmi + "입니다. 정상 입니다.");
		}
		else if(bmi >= 23 && bmi < 25) {
			System.out.println("당신의 BMI는 " + bmi + "입니다. 과체중 입니다.");
		}
		else if(bmi >= 25 && bmi < 30) {
			System.out.println("당신의 BMI는 " + bmi + "입니다. 비만 입니다.");
		} else {
			System.out.println("당신의 BMI는 " + bmi + "입니다. 고도비만 입니다.");
		}
		
	}

}
