package study;

import java.util.Scanner;

public class Deposit {
	Card card = new Card();
    public void deposit(){
		System.out.println("------------���-----------");
		System.out.println("��ǰ��"+card.getBalance());
		System.out.println("������Ҫ������Ŀ��");
 		Scanner input=new Scanner(System.in);
		String h=input.next();
		double h1;
		h1=Double.parseDouble(h);
		System.out.println("��ǰ��"+(card.getBalance()+h1));
		System.out.println("------------���ɹ����˳�-----------");
		input.close();
       }
}
