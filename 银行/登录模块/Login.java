package ��¼ģ��;

import java.util.Scanner;

public class Login{
    public void login(){
    	UserDao u1 = new Start();
  	   Scanner put  = new Scanner(System.in);
  	   int e = 2;
  	   for(int i = 0;i<3;i++){
  		   System.out.println("--------��¼ϵͳ--------");
  		   System.out.println("�����������û���:");
  		   String name = put.nextLine();
  		   System.out.println("��������������:");
  		   String pass = put.nextLine();
  		   boolean flag = u1.isLogin(name, pass);
  		   if(flag){
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
  	   put.close();
    }
}

