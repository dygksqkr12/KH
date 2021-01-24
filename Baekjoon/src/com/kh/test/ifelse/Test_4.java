package com.kh.test.ifelse;

import java.util.Scanner;

/**
 * 학생이름(String), 학년(int), 반(int),
번호(int), 성별(char), 성적(double)을 입력
받아 출력하는 프로그램을 만드세요. 성별은
(M/F)로 입력 받아 값에 따라 M은 남학생,
F는 여학생으로 문자를 변경하여 출력하세요.
출력 예 )
3학년 2반 24번 남학생 홍길동은 성적이 95.55이다.
 *
 */
public class Test_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String n = sc.next();
		System.out.print("학년을 입력하세요 : ");
		int g = sc.nextInt();
		System.out.print("반을 입력하세요 : ");
		int c = sc.nextInt();
		System.out.print("번호를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("성별을 입력하세요(M/F) : ");
		char s = sc.next().charAt(0);
		System.out.print("성적을 입력하세요 : ");
		double d = sc.nextDouble();
		
		if(s == 'M') {
			System.out.println(g+ "학년 " + c + "반 " + num + "번 " + "남학생 " + n + "은 성적이 " + d + "이다.");
		} else {
			System.out.println(g+ "학년 " + c + "반 " + num + "번 " + "여학생 " + n + "은 성적이 " + d + "이다.");
		}
	}

}
