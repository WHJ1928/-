package ����;
import org.apache.commons.lang3.ArrayUtils;

public class Cart {
    private Item[] items;

	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
    public void merge(){//�ϲ�����
    	for(int i = 0;i<items.length-1;i++){
    		if(items[i].equals(items[i+1])){
    			items[i].setAmount(items[i].getAmount()+items[i+1].getAmount());
    			//�����������ֵ�������� �ϲ���һ����������
    			items[i+1] = null;//��Ϊ��ֵ
    			items = ArrayUtils.subarray(items, 0, items.length-1);
    			//�������ȡ
    		}
    	}
    }
    	public void showCart(){
    		for (Item item : items){
    			System.out.println(item);
    		}
    	}

 }

