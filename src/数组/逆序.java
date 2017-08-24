package Êı×é;

import java.util.Arrays;

public class ÄæĞò {
  public static void main(String[] args){

	  int a[]= new int[]{1,3,2,6,4,7,5};
	  int b[]= new int[a.length];
	  for(int i=0;i<a.length;i++){
		  b[i]=a[a.length-1-i];
	  }
	  System.out.print(Arrays.toString(b)); 
  }
}
