package java_workshop_05;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월급 입력 : ");
		double salary = sc.nextDouble();
		Compony c = new Compony(salary);
		
		System.out.println("연 기본급 합 : " + c.getAnnualIncome() + " 세후 : " + c.getAfterTaxIncome() 
							+ "\n연 보너스 합 : " + c.getBonus() + " 세후  : " + c.getAfterTaxBonus()
							+ "\n연 지급액 합 : " + (c.getAfterTaxIncome() + c.getAfterTaxBonus()));
	}

}
