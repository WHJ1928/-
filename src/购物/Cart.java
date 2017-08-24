package 购物;
import org.apache.commons.lang3.ArrayUtils;

public class Cart {
    private Item[] items;

	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
    public void merge(){//合并数组
    	for(int i = 0;i<items.length-1;i++){
    		if(items[i].equals(items[i+1])){
    			items[i].setAmount(items[i].getAmount()+items[i+1].getAmount());
    			//将两个数组的值加起来来 合并到一个数组里组
    			items[i+1] = null;//设为空值
    			items = ArrayUtils.subarray(items, 0, items.length-1);
    			//将数组截取
    		}
    	}
    }
    	public void showCart(){
    		for (Item item : items){
    			System.out.println(item);
    		}
    	}

 }

