package java_workshop_05;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력 : ");
		String s = sc.next();
		
		char[] a = s.toCharArray();
		
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
		
	}

}
