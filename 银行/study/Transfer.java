package study;

import java.util.Scanner;

public class Transfer {
	Card card = new Card();
	public void transfer(){
    	System.out.println("------------转账------------");
		System.out.println("当前余额："+card.getBalance());
		System.out.println("请输入要转入的卡号：");
		Scanner input=new Scanner(System.in);
		String i1=input.next();
		System.out.println("请输入要转入的数目：");
 		Scanner put=new Scanner(System.in);
		String h=put.next();
		double h1;
		h1=Double.parseDouble(h);
		System.out.println("当前余额："+(card.getBalance()-h1));
		System.out.println("------------转账成功并退出-----------");
		input.close();
		put.close();
    }
}
