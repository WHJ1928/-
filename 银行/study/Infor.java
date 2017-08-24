package study;


public class Infor extends Client{
       
	public Infor() {
		
	}
	public Infor( String name, String sex, String tel,String IDcard,String address) {
		this.name = name;
		this.sex = sex;
		this.tel = tel;
		this.IDcard = IDcard;
		this.address = address;
	}
	@Override
	public String toString() {
		return "个人信息:"+"\n"+"姓名:" + name +"\n"+ "性别:" + sex +"\n" + "身份证号:" + IDcard +"\n"+ "电话:" + tel +"\n"+ "家庭住址:" + address; 
	}
       
}
