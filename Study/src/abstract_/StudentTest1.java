package abstract_;

/**
 * - StudentTest 클래스의 main 메소드는 다음을 수행

(1) 학번 11, 학점 1.5로 초기화한 학부생을 생성
(2) 학번 222, 학점 1.5로 초기화한 대학원생을 생성

(3) 학부생의 학번, 학점, 학사경고 여부를 조회하여 출력
(4) 대학원생의 학번, 학점, 학사경고 여부를 조회하여 출력

- 실행 예:
lab7_2: 홍길동

11 1.5 false
222 1.5 true
 *
 */
public class StudentTest1 {
	public static void main(String[] args) {
		Student1 s1 = new UnderGraduateStudent1(11, 1.5);
		Student1 s2 = new GraduateStudent1(222, 1.5);
		
		System.out.println(s1.getSnum() + " " + s1.getScore() +  " " + s1.warning());
		System.out.println(s2.getSnum() + " " + s2.getScore() +  " " + s2.warning());
	}
}
