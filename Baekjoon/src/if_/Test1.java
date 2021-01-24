package if_;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int s = sc.nextInt();
		
		if(s >= 90 || s == 100) {
			System.out.println("A");
		}
		else if( s >= 80) {
			System.out.println("B");
		}
		else if(s >= 70) {
			System.out.println("C");
		}
		else if(s >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
