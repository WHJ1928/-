package study;

import java.util.Scanner;

public class Change extends Infor{
        public void change1(){
        		System.out.println("-------------�޸���Ϣ------------");
        		System.out.println("���޸�������");
        		Scanner cname=new Scanner(System.in);
        		String name1=cname.next();
        		System.out.println("���޸ĵ绰��");
        		Scanner ctel=new Scanner(System.in);
        		String tel1=ctel.next();
        		System.out.println("���޸�סַ��");
        		Scanner caddress=new Scanner(System.in);
        		String password1=caddress.next();
        		System.out.println("���޸����룺");
        		Scanner cpassword=new Scanner(System.in);
        		String pas1=cpassword.next();
        		System.out.println("------------�޸ĳɹ����˳�-----------");
        		cname.close();caddress.close();
        		cpassword.close();ctel.close();
        }
 
}
