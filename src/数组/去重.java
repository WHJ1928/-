package 数组;

import java.util.Arrays;

public class 去重 {
    public static void main(String[] args){
    	int a[]={1,3,5,2,6,3,6,5,8,7,9};
    	for (int i = 0;i < a.length - 1;i ++){
    		for (int j = i + 1;j < a.length;j ++){
    			if (a[i] == a[j]){
    				a[j] = 0;
    			}
            }
    	}
    	System.out.print(Arrays.toString(a));
    }
}



