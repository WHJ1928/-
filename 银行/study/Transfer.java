package study;

import java.util.Scanner;

public class Transfer {
	Card card = new Card();
	public void transfer(){
    	System.out.println("------------ת��------------");
		System.out.println("��ǰ��"+card.getBalance());
		System.out.println("������Ҫת��Ŀ��ţ�");
		Scanner input=new Scanner(System.in);
		String i1=input.next();
		System.out.println("������Ҫת�����Ŀ��");
 		Scanner put=new Scanner(System.in);
		String h=put.next();
		double h1;
		h1=Double.parseDouble(h);
		System.out.println("��ǰ��"+(card.getBalance()-h1));
		System.out.println("------------ת�˳ɹ����˳�-----------");
		input.close();
		put.close();
    }
}
