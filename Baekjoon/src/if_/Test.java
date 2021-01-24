package if_;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A 입력 : ");
		int a = sc.nextInt();
		System.out.print("B 입력 : ");
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(a + " > " + b);
		}
		else if(a < b) {
			System.out.println(a + " < " + b);
		}
		else if(a == b) {
			System.out.println(a + " == " + b);
		}
	}

}
