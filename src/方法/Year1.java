package ����;

public class Year1 {
	public static void main(String[] args) {
		Year1.method1(2012);
	}
	
	public static void method1(int year) {
		
        if(year%4==0&&year%100!=0||year%400==0){
        	System.out.println("����"); 
        }else{
        	System.out.println("��������");
        } 

	}

}
