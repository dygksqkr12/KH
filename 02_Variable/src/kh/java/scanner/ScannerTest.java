package kh.java.scanner;

import java.util.Scanner;

/**
 * Scanner
 * 1. next계열
 *		- next():String
 *		- nextInt():int
 *		- nextDouble():double
 *		- nextBoolean():boolean
 *
 * 2. nextLine계열
 * 		- nextLine():String
 *
 */
public class ScannerTest {

	public static void main(String[] args) {
		
		ScannerTest s = new ScannerTest();
//		s.test1();
//		s.test2();
		s.test3();
		
	}
	
	/**
	 * @실습문제
	 * 사용자로부터 이름, 나이 , 주소, 키(175cm), 몸무게(70.3kg)를 입력받고
	 * 출력하세요.
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine(); //개행문자 날리기용
		
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		
		System.out.print("번지 호 : ");
		String addrDetail = sc.nextLine();
		
		System.out.print("키(ex.175) : ");
		int cm = sc.nextInt();
		
		System.out.print("몸무게(ex.70.3) : ");
		double kg = sc.nextDouble();
		
//		System.out.println("이름 = " + name 
//							+ "\n나이 = " + age 
//							+ "\n주소 = " + addr 
//							+ "\n번지 = " + addrDetail
//							+ "\n키 = " + cm + "cm" 
//							+ "\n몸무게 = " + kg + "kg");
		
		System.out.printf("이름 : %s%n" +
						  "나이 : %d세%n" +
						  "주소 : %s%n" +
						  "번지 : %s%n" +
						  "키 : %dcm%n" +
						  "몸무게 : %.1fkg", 
						  name, age, addr, addrDetail, cm, kg);
	}
	
	/**
	 * nextLine계열
	 * - 입력버퍼에서 개행문자까지 읽어온후,
	 *   개행문자를 제외하고 반환한다.
	 *   
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println("name = " + name);
		
		//개행문자 날리기용 (next는 개행문자를 남기기 때문에 개행문자를 날려야 다음 메소드가 정상 작동한다.)
		sc.nextLine();
		
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		System.out.println("addr = " + addr);
		
	}
	
	/**
	 * next계열
	 * - 입력버퍼에서 공백이나 개행문자 전까지 읽어서 반환한다.
	 * - 사용자입력값 이전의 공백/개행문자는 무시한다.
	 */
	public void test1() {
		//System.out 표준출력(콘솔)
		//System.in 표준입력(키보드)
		Scanner sc = new Scanner(System.in);
//		System.out.print("이름 : ");
//		String name = sc.next();
//		System.out.println("name = " + name);
		
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		System.out.println(" num " + num);
		
//		System.out.print("실수 : ");
//		double dnum = sc.nextDouble();
//		System.out.println("dnum = " + dnum);
//		
//		System.out.print("참/거짓(true/false) : ");
//		boolean bool = sc.nextBoolean();
//		System.out.println("bool = " + bool);
		
//		System.out.print("딱 한글자만 입력 : ");
//		char ch = sc.nextChar(); // 없음
//		String s = sc.next();
//		char ch = s.charAt(0); // 첫글자를 의미하는 0
		
//		char ch = sc.next().charAt(0); // charAt = String의 메소드
//		System.out.println("ch = " + ch);
		
		//next의 특징(한계)
		System.out.print("주소 : ");
		String addr = sc.next();
		System.out.println("[addr = " + addr + "]");
		addr = sc.next();
		System.out.println("[addr = " + addr + "]");
	}
	
}
