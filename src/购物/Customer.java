package ¹ºÎï;

import java.util.Arrays;

public class Customer {
      private int Cid;
      private String Cname;
      
      private Profile[] profile;
      
      public Customer(){
    	  
      }
      public Customer(int Cid,String Cname,Profile[] profile){
    	  this.Cid = Cid;
    	  this.Cname = Cname;
    	  this.profile =profile;
      }
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public Profile[] getProfile() {
		return profile;
	}
	public void setProfile(Profile[] profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "Customer [Cid=" + Cid + ", Cname=" + Cname + ", profile=" + Arrays.toString(profile) + "]";
	}
	
}
