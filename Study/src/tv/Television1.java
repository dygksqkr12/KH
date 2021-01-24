package tv;

/**
 * 텔레비전을 나타내는 Television 클래스를 정의하고, 
 * Television 배열을 이용하는 프로그램을 작성하시오.

두개의 파일, 두개의 클래스로 작성할 것

- Television 클래스: 채널(정수형) 필드를 가짐
 *
 */
public class Television1 {
	private int ch;

	public Television1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Television1(int ch) {
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
		return "Television1 [ch=" + ch + "]";
	}
}
