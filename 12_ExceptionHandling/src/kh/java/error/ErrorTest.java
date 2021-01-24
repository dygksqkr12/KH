package kh.java.error;

public class ErrorTest {

	public static void main(String[] args) {
		ErrorTest e = new ErrorTest();
//		e.test1();
		e.test2();
		System.out.println("----- 프로그램 정상 종료 -----");
	}
	
	public void test2() {
		System.out.println("test2호출!");
		test2();// 종료조건 없는 재귀호출
		//java.lang.StackOverflowError
	}
	
	public void test1() {
		long[] arr = new long[Integer.MAX_VALUE];
		//java.lang.OutOfMemoryError: Requested array size exceeds VM limit
		
	}

}
