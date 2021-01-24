package test;

public class Test___20 {

	private String name;
	private char s;
	private int age;
	private String job;
	private boolean marry;
	public Test___20() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test___20(String name, char s, int age, String job, boolean marry) {
		super();
		this.name = name;
		this.s = s;
		this.age = age;
		this.job = job;
		this.marry = marry;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getS() {
		return s;
	}
	public void setS(char s) {
		this.s = s;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public boolean isMarry() {
		return marry;
	}
	public void setMarry(boolean marry) {
		this.marry = marry;
	}
	@Override
	public String toString() {
		return "회원정보 [이름=" + name + ", 성별=" + s + ", 나이=" + age + ", 직업=" + job + ", 결혼여부=" + marry + "]";
	}
}
