package ����;
import java.util.*;
public class �׳˷��� {
	public static int factorial(int a){
		if(a<0){System.out.println("�����������Ч�������䣡");return 0;}
		else if(a==0 || a==1){return 1;}
		else return a*factorial(a-1);
	}
	@SuppressWarnings("resource")
	public static void main(String[] args)throws Exception{
          System.out.println("������һ��������");
           Scanner s= new Scanner(System.in);
           int a=s.nextInt();
           System.out.println(a+"!="+factorial(a));
       }   
}
