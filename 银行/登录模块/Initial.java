package ��¼ģ��;

import java.util.Scanner;

public class Initial {//��ʼ����
       public void start(){
    	   while (true) {
    	   System.out.println("-----------��ӭʹ��309����ϵͳ-----------");
		    System.out.println("1.��¼ |2.ע�� |");
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
                   System.out.println("ллʹ�ã���ӭ�´�����");
                   System.exit(0);
                   break;
       }
    		scanner.close();
       }
    }
}
