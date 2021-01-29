package java_workshop04;

public class Calc {
	public int calculater(int data) {
//		System.out.println(data);
		int num = 0;
		System.out.print("짝수 : ");
		for (int i = 1; i <= data; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				num += i;
			}
		}
		System.out.println();
		return num;
		
	}
}
