package com.kh.test.switchcase;

import java.util.Scanner;

public class Test__2 {

	public static void main(String[] args) {
		int num = 0;
		String n = "";
		
		Scanner sc = new Scanner(System.in);
		String main = ("**********주메뉴**********\n"
						 + "a. 불고기버거 ---------5000\n"
						 + "b. 새우버거 ----------4000\n"
						 + "c. 치킨버거 ----------4500\n"
						 + "d. 한우버거 ----------10000\n"
						 + "e. 디버거------------7000\n"
						 + "************************\n"
						 + "주메뉴를 선택하세요 : ");
		System.out.print(main);
		char m = sc.next().charAt(0);
		
		String side =("********사이드메뉴*********\n"
						 + "1. 콜라 -------------1500\n"
						 + "2. 사이다 ------------1500\n"
						 + "3. 밀크쉐이크 ---------2500\n"
						 + "4. 레드불 ------------3000\n"
						 + "************************\n"
						 + "사이드메뉴를 선택하세요 : ");
		System.out.print(side);
		int s = sc.nextInt();
//		if(m <'a'|| m > 'e' || s < 1 || s > 4) {
//			System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
//			return;
//		}
		switch(m) {
		case 'a' : num += 5000; n += "불고기버거, ";break;
		case 'b' : num += 4000; n += "새우버거, ";break;
		case 'c' : num += 4500; n += "치킨버거, ";break;
		case 'd' : num += 10000; n += "한우버거, ";break;
		case 'e' : num += 7000; n += "디버거, ";break;
		default : System.out.println("잘못입력하셨습니다. 영업을 종료합니다.");
		return;
		}
		
		switch(s) {
		case 1 : num += 1500; n += "콜라";break;
		case 2 : num += 1500; n += "사이다";break;
		case 3 : num += 2500; n += "밀크쉐이크";break;
		case 4 : num += 3000; n += "레드불";break;
		default : System.out.println("잘못입력하셨습니다. 영업을 종료합니다.");
		return;
		}
		
		System.out.println(n + "은(는) 총 " + num + "입니다.");
	}

}
