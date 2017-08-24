package 购物;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Orders {
      private String Oid;
      private Date date;
      private SimpleDateFormat sim;
      private Profile profile;
      private Cart cart;//假设清空购物车，不清空不能这样写
      //还可以加支付 促销 积分 等
       
      private double total = 0.0;//总金额
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

	Date time = new Date();//获取系统时间
	   SimpleDateFormat t1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   String nowTime=t1.format(time);

	@Override
	public String toString() {		
		
		
		String msg = "__________________________\n";
		
		msg += "----------订单信息----------\n";
		
		msg += "订单编号:" +Oid +"\n";
		
		msg += "订单日期:" +nowTime +"\n";
		
		msg += "收货地址:" +profile +"\n";
		
		msg += "购物清单:   \n";
		
		for(Item item : cart.getItems()){
			double currPriceTotle = item.getAmount()*item.getCommodity().getPrice();
			total +=  currPriceTotle;
			msg += item+"单项价格 : "+currPriceTotle+ "\n";			
		}
		msg += "__________________________\n 订单总额=" + total;
		return msg;
	}

//	public void modify (){//修改订单
//		System.out.println("是否修改订单？");
//	//	Scanner
//	}
}

