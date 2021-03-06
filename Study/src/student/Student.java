package student;

/**
 * 다음과 같은 학생 프로그램을 작성하시오.

- Student 클래스
 속성 : 다음과 같은 1가지 private 필드
   학번(정수형)

 기능 : 다음과 같은 2가지 public 메소드(getter/setter)
   학번 지정
   학번 조회
   ** 위의 2가지 메소드에는 출력문을 두지 말 것

- StudentTest 클래스의 main 메소드에서 다음을 수행
 (1) 학생 객체를 생성
 (2) 학생 학번을 적절히 지정
 (3) 학생 객체의 학번을 조회하여 출력

** 꼭 필요한 경우 이외에는 필드를 private로 선언할 것(이어지는 모든 과제에 해당함)
 * @author yohan
 *
 */
public class Student {

	private int num;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Student [학번=" + num + "]";
	}
}
