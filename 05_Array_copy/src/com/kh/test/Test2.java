package com.kh.test;

/*
	길이가 5인 String 배열을 선언하고, 
	“딸기”, ”복숭아”, ”키위”, ”사과” , ”바나나” 로 초기화를 한 후, 
	배열 인덱스를 활용해서 바나나를 출력해 보세요

 */
public class Test2 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.test();
	}

	private void test() {
		String[] strArr = {"딸기","복숭아","키위","사과","바나나"};
		
		System.out.println(strArr[4]);
	}

}
