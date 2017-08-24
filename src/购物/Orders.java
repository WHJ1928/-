package ����;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Orders {
      private String Oid;
      private Date date;
      private SimpleDateFormat sim;
      private Profile profile;
      private Cart cart;//������չ��ﳵ������ղ�������д
      //�����Լ�֧�� ���� ���� ��
       
      private double total = 0.0;//�ܽ��
      public Orders(String oid,SimpleDateFormat sim,Profile profile,Cart cart){
    	  this.Oid = oid;
    	  this.sim = sim;
    	  this.profile = profile; 
      	  this.cart = cart;
    	   
      }
	public String getOid() {
		return Oid;
	}
	public void setOid(String oid) {
		Oid = oid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	   public SimpleDateFormat getSim() {
		return sim;
	}
	public void setSim(SimpleDateFormat sim) {
		this.sim = sim;
	}

	Date time = new Date();//��ȡϵͳʱ��
	   SimpleDateFormat t1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   String nowTime=t1.format(time);

	@Override
	public String toString() {		
		
		
		String msg = "__________________________\n";
		
		msg += "----------������Ϣ----------\n";
		
		msg += "�������:" +Oid +"\n";
		
		msg += "��������:" +nowTime +"\n";
		
		msg += "�ջ���ַ:" +profile +"\n";
		
		msg += "�����嵥:   \n";
		
		for(Item item : cart.getItems()){
			double currPriceTotle = item.getAmount()*item.getCommodity().getPrice();
			total +=  currPriceTotle;
			msg += item+"����۸� : "+currPriceTotle+ "\n";			
		}
		msg += "__________________________\n �����ܶ�=" + total;
		return msg;
	}

//	public void modify (){//�޸Ķ���
//		System.out.println("�Ƿ��޸Ķ�����");
//	//	Scanner
//	}
}

