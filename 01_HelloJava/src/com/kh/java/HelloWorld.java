package com.kh.java;

import com.kh.java.other.OtherJava;

//java.lang패키지의 모든 클래스는 import문 없이 사용이 가능
import java.lang.*;//안써도된다.
import java.util.Date;

/**
 * javadoc 주석 (클래스, 메소드 레벨에 작성)
 * 
 * 실제 클래스명 : package + class
 * 
 * com.kh.java.HelloWorld
 * 
 * kr.or.iei.hello.world.member.Member
 * 
 * 같은 패키지안에 동일한 이름의 클래스는 존재할 수 없다.
 * 다른 패키지안의 동일한 이름의 클래스는 존재할 수 있다.
 * 
 * 패키지란?
 * 보통  성격이 같은 클래스의 모음
 * 패키지는 겹치지 않도록 보통 도메인을 거꾸로 사용한다. com.kh.HelloWorld
 * 패키지는 고유하게 관리하기 위해 3레벨 이상을 추천한다. com.naver.www
 * 
 */
public class HelloWorld {
	
	public void test2() {
		System.out.println("test2 호출!");
	}
	
	
	/**
	 * 프로그램의 첫 실행메소드
	 * 
	 * 객체 지향 언어 Object Oriented Language
	 * 객체란 메모리에 적재된 데이터 저장 공간
	 * 
	 * 객체레시피
	 * 클래스명 변수명 = new 클래스명();
	 *  
	 */
	public static void main(String[] args) {
		
//		System.out.println("Hello World~");
//		System.out.println("안녕!");
		
		//클래스 -> 객체
		HelloWorld hw = new HelloWorld();
		hw.test1();//메소드 호출부
		hw.test2();
		
		KHJava kh = new KHJava();
		kh.welcome();
		
		//다른 패키지의 클래스 가져다 쓰는 경우 import문이 필요.
		OtherJava oj = new OtherJava();
		oj.callMe();
		
		//jdk제공 클래스 사용하기
		//import문 안쓰려면 = java.util.Date now = new java.util.Date();
		Date now = new Date();//java프로그래밍할때 자주 쓰는 날짜
		System.out.println(now);
		
		//java.sql.Date, java.util.Date를 동시에 써야하면 import문을 사용못함
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());//데이터베이스 연결해서 사용할때 자주 쓰는 날짜
		System.out.println(today);
//		System.out.println("메인 메소드 출력!");
	}
	
	//메소드 선언부
	public void test1() {
		System.out.println("test1 호출!");
	}

}
