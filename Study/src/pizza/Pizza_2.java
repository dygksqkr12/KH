package pizza;

/**
 * 두개의 파일, 두개의 클래스로 작성할 것

- Pizza 클래스: 다음 세 개의 필드를 지님
  브랜드(문자열)
  지름(실수형)
  가격(정수형)
 

- PizzaTest 클래스: main 메소드에서 다음을 수행
  (1) 피자를 하나 생성
  (2) 피자의 브랜드, 지름, 가격을 적절히 지정
  (3) 피자의 광고 문구(브랜드, 지름, 가격을 언급)를 출력
 * @author yohan
 *
 */
public class Pizza_2 {
	private String b;
	private double s;
	private int p;
	public Pizza_2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pizza_2(String b, double s, int p) {
		super();
		this.b = b;
		this.s = s;
		this.p = p;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public double getS() {
		return s;
	}
	public void setS(double s) {
		this.s = s;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "맛난 피자 [브랜드 = " + b + ", 사이즈 = " + s + "cm" + ", 가격 =" + p + "원 ]";
	}
}
