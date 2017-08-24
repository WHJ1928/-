package 购物;

public class Profile {//收货地址
      private String addr;
      private String Pname;
      
      private boolean isDefault = false;
      public Profile(){
    	  
      }
      public Profile(String addr,String Pname, boolean isDefault){
//    	  super();
    	  this.addr = addr;
    	  this.Pname = Pname;
    	  this.isDefault = isDefault;
      }
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	@Override
	public String toString() {
		return " 详细地址：" + addr + ", 姓名：" + Pname + ", 是否默认地址：" + isDefault ;
	}
	
}
