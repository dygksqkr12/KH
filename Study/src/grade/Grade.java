package grade;

/**
 * 성적(실수형)
  
 기능 : 다음과 같은 7가지 public 메소드
   학번 getter/setter
   이름 getter/setter
   성적 getter/setter
   합격여부 조회 - 기준성적을 매개변수로 받아 성적이 그 이상이면 true, 아니면 false 리턴

   ** 위의 7가지 메소드에는 출력문을 두지 말 것

- StudentTest 클래스의 main 메소드에서 다음을 수행
  (1) 학생 객체를 하나 생성(s1이라고 하자)
  (2) 사용자로부터 입력받은 값으로 s1의 학번, 이름, 성적을 지정 - 반드시 학번, 이름, 성적 순으로 입력받을 것

  (3) 학생 객체를 하나 더 생성(s2라고 하자)
  (4) 사용자로부터 입력받은 값으로 s2의 학번, 이름, 성적을 지정 - 반드시 학번, 이름, 성적 순으로 입력받을 것

  (5) s1과 s2의 학번 중 앞선 학번(고학년) 출력
  (6) s1과 s2의 이름 중 사전적으로 앞선 이름 출력
  (7) s1과 s2의 성적 중 높은 성적 출력

  (8) 기준성적을 1.5로 s2의 합격여부를 조회하여 합격/불합격 출력
  (9) 기준성적을 1.5로 s2의 합격여부를 조회하여 합격/불합격 출력

- 참고:

System.out.print("학번 입력: ");
int id = scan.nextInt();

scan.nextLine(); // 이 문장 추가

System.out.print("이름 입력: ");
String name = scan.nextLine();

...
 * @author yohan
 *
 */
public class Grade {
	
	private int num;
	private String name;
	private int gd;
	private boolean ok;
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grade(int num, String name, int gd, boolean ok) {
		super();
		this.num = num;
		this.name = name;
		this.gd = gd;
		this.ok = ok;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGd() {
		return gd;
	}
	public void setGd(int gd) {
		this.gd = gd;
	}
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	@Override
	public String toString() {
		return "Grade [num=" + num + ", name=" + name + ", gd=" + gd + ", ok=" + ok + "]";
	}
}
