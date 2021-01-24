package if_;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시간(0~24), 분을 입력하세요(0~60) : ");
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) {
			if(h - 1 < 0)
				h = 23;
			else
				h--;
			m = m + 15;
		}
		else {
			m = m - 45;
		}
		System.out.println(h + " " + m);
	}
}

