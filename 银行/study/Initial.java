package study;

import java.util.Scanner;

public class Initial {//��ʼ����
       public void start(){
    	   System.out.println("-----------��ӭʹ��309����ϵͳ-----------");
		    System.out.println("1.��¼ |2.ע�� |");
       }
       public void lmain(){
    	   Scanner scanner=new Scanner(System.in);
    		int i=scanner.nextInt();
    		switch(i) { 
   		    case 1: 
   		     Login login = new Login("qwer", "whj");
   	         login.login();
   		       break; 
   		       case 2: 
   		       Register register = new Register();
   		       register.add();
   		       break;  
       }
    		scanner.close();
       }
}
