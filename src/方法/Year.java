package ����;
import java.util.Scanner;
public class Year {
       public static void main(String[] args)throws Exception{
          System.out.println("��������ݣ�");
           Scanner a= new Scanner(System.in);
           System.out.println((a));
       }
       public static void factorial(int a){
   		if( a%4 == 0&& a%100==0|| a%400==0){
   			System.out.println(a+"������");
   		}
   		else{
   			System.out.println(a+"��������");
   		}
}
}