package if_;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("좌표 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("1");
		}
		else if(x < 0 && y > 0) {
			System.out.println("2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("3");
		}
		else if(x > 0 && y <0) {
			System.out.println("4");
		}else {
			System.out.println("어디에도 속하지 않음");
		}
	}

}
