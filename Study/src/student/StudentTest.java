package student;

import java.util.Scanner;

/**
 * - StudentTest 클래스의 main 메소드에서 다음을 수행
 (1) 학생 객체를 생성
 (2) 학생 학번을 적절히 지정
 (3) 학생 객체의 학번을 조회하여 출력

** 꼭 필요한 경우 이외에는 필드를 private로 선언할 것(이어지는 모든 과제에 해당함)
 * @author yohan
 *
 */
public class StudentTest {
	
	public static void main(String[] args) {
		Student s1 = new Student(135555);
		Student s2 = new Student(136666);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("조회 : ");
		String stu = sc.next();
		
		switch(stu) {
		case "s1" : System.out.println(s1);break;
		case "s2" : System.out.println(s2);break;
		default : System.out.println("그런 학생은 없습니다.");
		} 
		
	}
}
