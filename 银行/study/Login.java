package study;

import java.util.Scanner;

public class Login {
	   private String account;
       private String password;
       
       public Login(String account, String password) {
   		this.account = account;
   		this.password = password;
   	}
       @SuppressWarnings("resource")
	public  void login(){
    	   Scanner put  = new Scanner(System.in);
    	   int e = 2;
    	   for(int i = 0;i<3;i++){
    		   System.out.println("--------��¼ϵͳ--------");
    		   System.out.println("�����������û���:");
    		   String user = put.nextLine();
    		   System.out.println("��������������:");
    		   String pass = put.nextLine();
    		   if(user.equals(account) && pass.equals(password)){
    			   System.out.println("��ϲ����¼�ɹ�");
    			   System.out.println("-------------------");
    			   break;
    		   }else if (e!=0) {
				System.out.println("�û������������!������.������"+e+"�λ���");
				e--;
				continue;
			}else {
				System.out.println("�Բ��������˻������������������ԣ�");
				System.exit(0);
				break;
			}
    	   }
       }
}
