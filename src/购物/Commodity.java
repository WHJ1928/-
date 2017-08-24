package 购物;

public class Commodity {
       private int id;
       private String name;
       private double price;
       public Commodity(){
    	   
       }
       public Commodity(int id,String name,double price){
    	   this.id = id;
    	   this.name = name;
    	   this.price = price;
       }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "商品编号 =" + id + ", 商品名=" + name + ", 单价=" + price ;
	}
	
}
