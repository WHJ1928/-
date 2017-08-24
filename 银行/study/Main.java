package study;

import java.util.Scanner;

public class Main {
	public void infor(){
		   System.out.println("----------------------");
		    System.out.println("1.账户信息 |2.存款 |3.取款 |4.转账 |5.贷款|6.调息|7.登出"+"\n"+"请输入您的选择：");
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


