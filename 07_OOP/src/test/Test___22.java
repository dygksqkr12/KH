package test;

public class Test___22 {
	
	private String memberld;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	public Test___22() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test___22(String memberld, String memberPwd, String memberName, int age, char gender, String phone,
			String email) {
		super();
		this.memberld = memberld;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	public String getMemberld() {
		return memberld;
	}
	public void setMemberld(String memberld) {
		this.memberld = memberld;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "회원정보 [ld=" + memberld + ", Pwd=" + memberPwd + ", Name=" + memberName + ", age="
				+ age + ", gender=" + gender + ", phone=" + phone + ", email=" + email + "]";
	}
}
