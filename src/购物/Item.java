package ����;

public class Item {//�����嵥
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
	@Override//�鿴���ﳵʱ����
	public String toString() {
		return commodity + ", ����=" + amount +"\n-----------";
	}
	@Override//�ж�������Ʒ�Ƿ�һ����
	public boolean equals(Object obj) {
		Item item1 = this;
		Item item2 = (Item)obj;//����ת��
		if(item1.getCommodity().getId() == item2.getCommodity().getId()){
			return true;
		}else	
		return false;
	}
      
}
