package ����;

import java.text.SimpleDateFormat;

public class Test {

public static void main(String[] args){
	   Commodity c1 = new Commodity(1, "Java�����ŵ���ħ", 43);
	   Commodity c2 = new Commodity(2, "Java���˼��", 88);
	   Commodity c3 = new Commodity(3, "��Ϊ��ҫ9", 888);
	   
	   Customer peo1 = new Customer();
	   peo1.setCid(1);peo1.setCname("����");
	   
	   Profile p1  = new Profile( "��ܰ��Ԣ","����", true);
	   Profile p2  = new Profile( "ɽ����ѧ","С����", false);
	   Profile[] pro = {p1,p2}; 
	   
	   peo1.setProfile(pro);
	   
	   Item m1 = new Item(c1,5);
	   Item m2 = new Item(c2,5);
	   Item m3 = new Item(c3,2);
	   Item m4 = new Item(c2,6);
	   Item m5 = new Item(c1,3);
	   Item[] items = {m1,m2,m3,m4,m5};
	   
	  //�޸����ڸ�ʽ
//	   DateFormat t1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//	   String nowTime="";
//       nowTime= t1.format(time);
	  
	   
	   Cart cart = new Cart();
	   cart.setItems(items);
//���±ߵķ��������� ʹ��ͬ����Ʒֻ������ �����µ���
	   cart.merge();
	   //ʵ�ֲ鿴���ﳵ�Ĺ���
	   System.out.println("�鿴���ﳵ"+"\n----------");
	   cart.showCart();
	   //���ɶ���
	   System.out.println("���ɶ���:");
	   System.out.println("");
	   
	   long times = System.currentTimeMillis();//���ϵͳʱ���longֵ
	   SimpleDateFormat time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

//String.valueOf(times) �����������������ת��Ϊ �ַ��� ,�˴��� �� longת��Ϊ String 	   
         Orders order = new Orders(String.valueOf(times),time, p1, cart);
         System.out.println(order);
//       cart.createOrder();
       //�޸Ķ���
	   
   }
}
