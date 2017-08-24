package study;

import java.util.Scanner;

public class Initial {//初始界面
       public void start(){
    	   System.out.println("-----------欢迎使用309银行系统-----------");
		    System.out.println("1.登录 |2.注册 |");
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
