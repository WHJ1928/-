package study;

import java.util.Scanner;

public class Withdrawal {
	Card card = new Card("65487219267336982", 122.56);
	 public void withdrawal(){
	    	System.out.println("------------ȡ��------------");
			System.out.println("��ǰ��"+card.getBalance());
			System.out.println("������Ҫȡ����Ŀ��");
	 		Scanner input=new Scanner(System.in);
			String h=input.next();
			double h1;
			h1=Double.parseDouble(h);
			System.out.println("��ǰ��"+(card.getBalance() -h1));
			System.out.println("------------ȡ��ɹ����˳�-----------");
			input.close();
	    }
}
