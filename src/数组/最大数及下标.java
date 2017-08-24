package 数组;

public class 最大数及下标 {
	public static void main(String[] args){
		int a []={18,25,7,36,13,2,89,63};
           int c = 0;
           int b = a[0];
            for(int i=0; i<a.length; i++){
            if(a[i] > b){
                b = a[i];
                c = i;
            }
        }
        System.out.println("数组中最大值是"+b+"，下标是"+c);
    }
 }

