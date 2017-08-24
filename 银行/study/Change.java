package study;

import java.util.Scanner;

public class Change extends Infor{
        public void change1(){
        		System.out.println("-------------修改信息------------");
        		System.out.println("请修改姓名：");
        		Scanner cname=new Scanner(System.in);
        		String name1=cname.next();
        		System.out.println("请修改电话：");
        		Scanner ctel=new Scanner(System.in);
        		String tel1=ctel.next();
        		System.out.println("请修改住址：");
        		Scanner caddress=new Scanner(System.in);
        		String password1=caddress.next();
        		System.out.println("请修改密码：");
        		Scanner cpassword=new Scanner(System.in);
        		String pas1=cpassword.next();
        		System.out.println("------------修改成功并退出-----------");
        		cname.close();caddress.close();
        		cpassword.close();ctel.close();
        }
 
}
