package study;

import java.util.Scanner;

public class Withdrawal {
	Card card = new Card("65487219267336982", 122.56);
	 public void withdrawal(){
	    	System.out.println("------------取款------------");
			System.out.println("当前余额："+card.getBalance());
			System.out.println("请输入要取出数目：");
	 		Scanner input=new Scanner(System.in);
			String h=input.next();
			double h1;
			h1=Double.parseDouble(h);
			System.out.println("当前余额："+(card.getBalance() -h1));
			System.out.println("------------取款成功并退出-----------");
			input.close();
	    }
}
