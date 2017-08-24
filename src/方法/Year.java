package 方法;
import java.util.Scanner;
public class Year {
       public static void main(String[] args)throws Exception{
          System.out.println("请输入年份：");
           Scanner a= new Scanner(System.in);
           System.out.println((a));
       }
       public static void factorial(int a){
   		if( a%4 == 0&& a%100==0|| a%400==0){
   			System.out.println(a+"是闰年");
   		}
   		else{
   			System.out.println(a+"不是闰年");
   		}
}
}