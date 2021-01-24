package com.kh.test.switchcase;

import java.util.Scanner;

public class Test__3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int s = sc.nextInt();
		String g = "";
		switch(s / 10) {
		case 10 : 
		case 9 : g = "수"; break;
		case 8 : g = "우"; break;
		case 7 : g = "미"; break;
		case 6 : g = "양"; break;
		default : g = "가"; break;
		}
		System.out.println(s + "점은 " + g + "입니다.");
	}

}
