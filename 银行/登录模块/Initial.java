package 登录模块;

import java.util.Scanner;

public class Initial {//初始界面
       public void start(){
    	   while (true) {
    	   System.out.println("-----------欢迎使用309银行系统-----------");
		    System.out.println("1.登录 |2.注册 |");
    	   Scanner scanner=new Scanner(System.in);
    		String i=scanner.nextLine();
    		switch(i) { 
   		    case "1": 
   		     Login login = new Login();
   	         login.login();
   		       break; 
   		       case "2": 
   		       Regist regist = new Regist();
   		       regist.add();
   		       break; 
               case "3":
               default:
                   System.out.println("谢谢使用，欢迎下次再来");
                   System.exit(0);
                   break;
       }
    		scanner.close();
       }
    }
}
