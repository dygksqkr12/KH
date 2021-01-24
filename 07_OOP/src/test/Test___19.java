package test;

public class Test___19 {

	private String name;
	private int num;
	private String pt;
	
	public Test___19() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test___19(String name, int num, String pt) {
		super();
		this.name = name;
		this.num = num;
		this.pt = pt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPt() {
		return pt;
	}
	public void setPt(String pt) {
		this.pt = pt;
	}
	@Override
	public String toString() {
		return "선수 [이름=" + name + ", 번호=" + num + ", 포지션" + pt + "]";
	}

}
