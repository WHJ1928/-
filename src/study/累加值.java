package study;

public class 累加值 {
	public static void main(String[] args){
        int sum=0;
        for(int i=1; i<=100;i++){
        if(i%10==3) continue;//个位为3,跳出这次循环,进入下一次循环,不执行sum+=i;
                sum+=i;
        }
         
        System.out.println("\nThe sum is: "+sum);
    }
}
