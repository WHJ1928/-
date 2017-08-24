package 购物;

public class Item {//购物清单
      private Commodity commodity;
      private int amount;
      public Item(){
    	  
      }
      public Item(Commodity commodity,int amount){
    	  this.commodity = commodity;
    	  this.amount = amount;
      }
	public Commodity getCommodity() {
		return commodity;
	}
	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override//查看购物车时调用
	public String toString() {
		return commodity + ", 数量=" + amount +"\n-----------";
	}
	@Override//判断两个产品是否一样样
	public boolean equals(Object obj) {
		Item item1 = this;
		Item item2 = (Item)obj;//向下转化
		if(item1.getCommodity().getId() == item2.getCommodity().getId()){
			return true;
		}else	
		return false;
	}
      
}
