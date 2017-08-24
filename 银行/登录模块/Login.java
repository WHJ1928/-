package 登录模块;

import java.util.Scanner;

public class Login{
    public void login(){
    	UserDao u1 = new Start();
  	   Scanner put  = new Scanner(System.in);
  	   int e = 2;
  	   for(int i = 0;i<3;i++){
  		   System.out.println("--------登录系统--------");
  		   System.out.println("请输入您的用户名:");
  		   String name = put.nextLine();
  		   System.out.println("请输入您的密码:");
  		   String pass = put.nextLine();
  		   boolean flag = u1.isLogin(name, pass);
  		   if(flag){
  			   System.out.println("恭喜您登录成功");
  			   System.out.println("-------------------");
  			   break;
  		   }else if (e!=0) {
 				System.out.println("用户名或密码错误!请重输.您还有"+e+"次机会");
 				e--;
 				continue;
 			}else {
 				System.out.println("对不起，您的账户已锁定！请明天再试！");
 				System.exit(0);
 				break;
 			}
  	   }
  	   put.close();
    }
}

