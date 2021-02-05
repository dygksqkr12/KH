package java_workshop_05;

public class StudentTest {

	public static void main(String[] args) {
		
		Student sda[] = new Student[3];
		
		sda[0] = new Student("홍길동", 15, 171, 81);
		sda[1] = new Student("한사람", 13, 183, 72);
		sda[2] = new Student("임걱정", 16, 175, 65);
	
		double sage = 0;
		double shit = 0;
		double swig = 0;
		
		for (int i = 0; i < sda.length; i++) {
			System.out.println( sda[i]);
			
			sage += sda[i].getAge();
			shit += sda[i].getHeight();
			swig += sda[i].getWeigth();
			
		}
		System.out.printf("나이의 평균 : %.2f\n", sage/3);
		System.out.printf("신장의 평균 : %.2f\n", shit/3);
		System.out.printf("몸무게의 평균 : %.2f", swig/3);
	}

}
