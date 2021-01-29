package java_workshop04;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr3 = new int[5];
		
		int sum = 0;
		double avg = 0;
		int count = 0;
		
		for (int i = 0; i < arr3.length; i++) {
			int rd = r.nextInt(10) + 1;
			
			arr3[i] += rd;
			System.out.print(" " + arr3[i]);
			sum += rd;
			count++;
		}
		avg = (double)sum / count;
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
