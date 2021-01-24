package pizza;

public class Pizza_ {
	private String b;
	private double s;
	private int w;
	public Pizza_() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pizza_(String b, double s, int w) {
		super();
		this.b = b;
		this.s = s;
		this.w = w;
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
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	@Override
	public String toString() {
		return "Pizza_ [b=" + b + ", s=" + s + ", w=" + w + "]";
	}
}
