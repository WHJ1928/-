package study;

public class 奇偶之和 {
	public static void main(String[] args)
	{
		int i=0;
		int sum=0;
		while(i<=100){
		if(i%2==0){
		sum=sum+i;
		}
		i++;
		}
		System.out.println("偶数之和"+sum);
		int a=0;
		while(a<=100){
		if(a%2!=0){
		sum=sum+a;
		}
		a++;
		}
		System.out.println("奇数之和"+sum);
	}
}
