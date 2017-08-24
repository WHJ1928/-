package 方法;
import java.util.*;
public class 阶乘方法 {
	public static int factorial(int a){
		if(a<0){System.out.println("输入的数字无效，请重输！");return 0;}
		else if(a==0 || a==1){return 1;}
		else return a*factorial(a-1);
	}
	@SuppressWarnings("resource")
	public static void main(String[] args)throws Exception{
          System.out.println("请输入一个整数：");
           Scanner s= new Scanner(System.in);
           int a=s.nextInt();
           System.out.println(a+"!="+factorial(a));
       }   
}
