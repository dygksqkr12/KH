package java_workshop04;

public class Test1 {

	public static void main(String[] args) {
		int[][] arr2 = {
				{ 5, 5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30,30}
				};
		int sum = 0;
		double sum2 = 0;
		int count = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
//				System.out.println(sum);
//				sum = arr2[i][j];
//				System.out.println(sum);
				sum += arr2[i][j];
				count++;
			}
//			sum2 += sum / i;
		}
//		double avg = sum / count;
		sum2 = sum / count;
		System.out.println(sum);
		System.out.println(sum2);
	}

}
