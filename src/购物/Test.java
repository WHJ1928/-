package 购物;

import java.text.SimpleDateFormat;

public class Test {

public static void main(String[] args){
	   Commodity c1 = new Commodity(1, "Java从入门到入魔", 43);
	   Commodity c2 = new Commodity(2, "Java编程思想", 88);
	   Commodity c3 = new Commodity(3, "华为荣耀9", 888);
	   
	   Customer peo1 = new Customer();
	   peo1.setCid(1);peo1.setCname("晨光");
	   
	   Profile p1  = new Profile( "致馨公寓","晨光", true);
	   Profile p2  = new Profile( "山西大学","小俊俊", false);
	   Profile[] pro = {p1,p2}; 
	   
	   peo1.setProfile(pro);
	   
	   Item m1 = new Item(c1,5);
	   Item m2 = new Item(c2,5);
	   Item m3 = new Item(c3,2);
	   Item m4 = new Item(c2,6);
	   Item m5 = new Item(c1,3);
	   Item[] items = {m1,m2,m3,m4,m5};
	   
	  //修改日期格式
//	   DateFormat t1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//	   String nowTime="";
//       nowTime= t1.format(time);
	  
	   
	   Cart cart = new Cart();
	   cart.setItems(items);
//用下边的方法做处理 使相同的商品只加数量 不加新的项
	   cart.merge();
	   //实现查看购物车的功能
	   System.out.println("查看购物车"+"\n----------");
	   cart.showCart();
	   //生成订单
	   System.out.println("生成订单:");
	   System.out.println("");
	   
	   long times = System.currentTimeMillis();//获得系统时间的long值
	   SimpleDateFormat time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

//String.valueOf(times) 代表将任意基本数据类转换为 字符串 ,此处是 将 long转换为 String 	   
         Orders order = new Orders(String.valueOf(times),time, p1, cart);
         System.out.println(order);
//       cart.createOrder();
       //修改订单
	   
   }
}
