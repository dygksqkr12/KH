package com.kh.test.switchcase;

import java.util.Scanner;

public class Test__5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int k = sc.nextInt();
		System.out.print("영어 점수 : ");
		int e = sc.nextInt();
		System.out.print("수학 점수 : ");
		int m = sc.nextInt();
		
		double avg = (k + e + m) / 3;
		
//		if(avg < 60) {
//			System.out.println("평균점수 미달로 불합격입니다.");
//		}
		
		switch(((k + e + m) / 3) / 10) {
		case 5 :
		case 1 : System.out.println("평균점수 미달로 불합격입니다.");	
		return;
		}
		
		switch(k / 10) {
		case 3 :
		case 0 : System.out.println("국어과목의 점수 미달로 불합격입니다.");
		return;
		}
		
		switch(e / 10) {
		case 3 :
		case 0 : System.out.println("영어과목의 점수 미달로 불합격입니다.");
		return;
		}
		
		switch(m / 10) {
		case 3 :
		case 0 : System.out.println("수학과목의 점수 미달로 불합격입니다.");
		}
		System.out.println("합격입니다.");
	}

}
