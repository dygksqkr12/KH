package e2018.exam2;

public class Exam02 {
	
	public static void main(String[] args) {
		Person[] a = new Person[2];
		a[0] = new Person("홍길동", 18);
		a[1] = new Person("임꺽정", 21);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
