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
		return "������Ϣ:"+"\n"+"����:" + name +"\n"+ "�Ա�:" + sex +"\n" + "���֤��:" + IDcard +"\n"+ "�绰:" + tel +"\n"+ "��ͥסַ:" + address; 
	}
       
}
