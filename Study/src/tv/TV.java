package tv;

/**
 * 텔레비전을 나타내는 Television 클래스를 정의하고, 
 * Television 배열을 이용하는 프로그램을 작성하시오.

두개의 파일, 두개의 클래스로 작성할 것

- Television 클래스: 채널(정수형) 필드를 가짐
 
- TelevisionTest 클래스: main 메소드에서 다음을 수행
  (1) 크기가 3인 텔레비전 배열에 텔레비전을 생성하여 저장
  (2) 텔레비전 채널을 7, 9, 11로 지정
  (3) 반복문을 이용하여 배열에 저장된 모든 텔레비전의 채널을 출력
 * @author yohan
 *
 */
public class TV {

	private int ch;

	public TV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TV(int ch) {
		super();
		this.ch = ch;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	@Override
	public String toString() {
		return "TV [ch=" + ch + "]";
	}
}
