package java_workshop04;

public class Test4 {
	
	public static void main(String[] args) {
		Calc cal = new Calc();
		
		int snum = Integer.parseInt(args[0]);
		System.out.println("결과 : " + cal.calculater(snum));
	}
}
