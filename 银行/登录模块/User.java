package 登录模块;

public class User {
//用户的密码
	 private String username;
	 private String password;
//这是用户的基本信息
	    private String name;
	    private String IDcard;
	    private String sex;
	    private String address;
	    private String tel;
	public User() {

	}
	public User(String username, String password, String name, String iDcard, String sex, String address, String tel) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.IDcard = iDcard;
		this.sex = sex;
		this.address = address;
		this.tel = tel;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "个人信息:"+"\n"+"姓名:" + name +"\n"+ "性别:" + sex +"\n" + "身份证号:" + IDcard +"\n"+ "电话:" + tel +"\n"+ "家庭住址:" + address;
	} 
	 
}
