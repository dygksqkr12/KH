package point;

/**
 * x 좌표를 갖는 1차원 점 클래스 정의하고 이용하는 프로그램이다. 아래 첨부한 코드를 완성하시오.

- Point 클래스
  필드: x좌표(double형)
  메소드:
     move() - double형 매개변수를 받아, 그 값만큼 x 좌표를 이동
     move() - 매개변수를 받지 않고, x 좌표를 1만큼 이동
     distance() - Point형 매개변수를 받아, 현재 점과의 거리(음수가 아님)를 구하여 리턴 *******
     toString() - x 좌표값을 문자열로 만들어 리턴

- PointTest 클래스는 첨부한 코드 참고
 *
 *
 *
 *
 */
public class Point {
	private double x;
	
	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Point(double x) {
		super();
		this.x = x;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	//x만큼 이동
	public void move(double num) {
		x += num;
	}
	//x를 1만큼 이동
	public void move() {
		x ++;
	}
	//현재 점과의 거리(음수가 아님)를 구하여 리턴
	public double distance(Point lab) {
		return Math.abs(x-lab.x);
	}
	@Override
	public String toString() {
		return "Point [x=" + x + "]";
	}
}
