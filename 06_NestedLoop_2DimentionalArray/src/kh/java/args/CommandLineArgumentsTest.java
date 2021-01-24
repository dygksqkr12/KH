package kh.java.args;

/**
 * 
 * 프로그램 시작과 동시에 사용자 입력값 받아 처리 가능하다.
 * 사용자 입력값을 " "을 구분자로 끊어서 String[]로 만들어 main메소드에 전달.
 *
 */
public class CommandLineArgumentsTest {
	
	public static void main(String[] args) {
		
//		for(int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		CommandLineArgumentsTest c = new CommandLineArgumentsTest();
//		c.test1(args);
		c.test2(1);
		c.test2(1,2);
		c.test2(1,2,3);
		c.test2(1,2,3,4);
		c.test2(3, 5, 1324, 35, 23424);
		
		System.out.printf("%s %d%n", "안녕", 123);
		
		System.out.println("프로그램 종료!");
		
	}
	/**
	 * 가변인자
	 * 타입이 동일하고, 개수가 정해지지 않은 매개인자를 처리할 수 있다.
	 * 가변인자는 매개변수 선언부에서 마지막에 작성해야 한다.
	 * 
	 * @param arr
	 */
	public void test2(int... arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
//			System.out.println(arr[i]);
			sum += arr[i];
		
		System.out.println(sum);
	}
	
	/**
	 * "1 2 3 4" -> "1", "2", "3", "4"
	 * @param args
	 */
	public void test1(String[] args) {
		int sum = 0;
		
		for(int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		
		System.out.println(sum);
	}

}
