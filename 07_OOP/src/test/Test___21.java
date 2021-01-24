package test;

public class Test___21 {
	private String name;
	private int p;
	private String pf;
	public Test___21() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test___21(String name, int p, String pf) {
		super();
		this.name = name;
		this.p = p;
		this.pf = pf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public String getPf() {
		return pf;
	}
	public void setPf(String pf) {
		this.pf = pf;
	}
	@Override
	public String toString() {
		return "가구 [이름=" + name + ", 가격=" + p + ", 기능=" + pf + "]";
	}
}
