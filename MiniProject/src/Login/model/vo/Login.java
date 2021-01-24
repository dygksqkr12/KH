package Login.model.vo;

import java.io.Serializable;

//serializable 객체입출력스트림에 사용하려면 사용.
public class Login implements Serializable{
	private String id;
	private String pwd;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Login(String id, String pwd, String name) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
	
	
