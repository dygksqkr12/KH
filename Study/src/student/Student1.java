package student;

/**
 * - Student 클래스
 속성 : 다음과 같은 1가지 private 필드
   학번(정수형)

 기능 : 다음과 같은 2가지 public 메소드(getter/setter)
   학번 지정
   학번 조회
   ** 위의 2가지 메소드에는 출력문을 두지 말 것

 **/
public class Student1 {
	private int snum;

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(int snum) {
		super();
		this.snum = snum;
	}

	public int getSnum() {
		return snum;
	}

	public void setSnum(int snum) {
		this.snum = snum;
	}

	@Override
	public String toString() {
		return "Student1 [snum=" + snum + "]";
	}
}
