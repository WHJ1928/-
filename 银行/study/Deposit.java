package study;

import java.util.Scanner;

public class Deposit {
	Card card = new Card();
    public void deposit(){
		System.out.println("------------存款-----------");
		System.out.println("当前余额："+card.getBalance());
		System.out.println("请输入要存入数目：");
 		Scanner input=new Scanner(System.in);
		String h=input.next();
		double h1;
		h1=Double.parseDouble(h);
		System.out.println("当前余额："+(card.getBalance()+h1));
		System.out.println("------------存款成功并退出-----------");
		input.close();
       }
}
