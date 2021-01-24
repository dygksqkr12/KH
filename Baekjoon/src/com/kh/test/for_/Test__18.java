package com.kh.test.for_;

import java.util.Scanner;

public class Test__18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" N : ");
		int n = sc.nextInt();
//		int num = sc.nextInt();
		
//		for (int i = 1; i <= n; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("-");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j <= n - i)
				System.out.print(" ");
				else {
					System.out.print("*");
				}
			}
				System.out.println();
//        for(int i = 1; i <= num; i++) {
//            for(int j = num; j > i; j--) {
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
        }
    }


		
	
}