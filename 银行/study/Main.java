package study;

import java.util.Scanner;

public class Main {
	public void infor(){
		   System.out.println("----------------------");
		    System.out.println("1.�˻���Ϣ |2.��� |3.ȡ�� |4.ת�� |5.����|6.��Ϣ|7.�ǳ�"+"\n"+"����������ѡ��");
	   }
	 public void main(){
 		Scanner scan=new Scanner(System.in);
 		int i=scan.nextInt();
 		switch(i) { 
		case 1: 
        Account account = new Account();
		account.acc();
		break; 
		case 2: 
		Deposit deposit = new Deposit();
		deposit.deposit();
		break;  
		case 3: 
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.withdrawal();
		break; 
		case 4: 
        Transfer transfer = new Transfer();
        transfer.transfer();
		break; 
		case 5: 

		break; 
		case 6: 
         
		break; 
//		case 7: 
//
//		break; 
		case 7: 
			Test.main(null);
		break; 
		}
 		scan.close();
	}

	 }


