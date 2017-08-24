package study;

public class Èý½ÇÐÎ {

       public static void main(String []args){
    	   int i, j,k;
    	   for ( i = 1; i <= 10; i++) {
    		   for ( j = 1; j <= 10 - i; j++) {
    		    System.out.print(" ");
    		   }
    		   if (i != 10) {
    		    for ( k = 1; k <= 2 * i - 1; k++) {
    		     if (k == 1 || k == 2 * i - 1) {
    		      System.out.print("*");
    		     } else {
    		      System.out.print(" ");
    		     }
    		    }
    		   } else {
    		    for ( k = 1; k <= 2 * i - 1; k++) {
    		     if (k % 2 != 0) {
    		      System.out.print(" ");
    		     } else {
    		      System.out.print(" ");
    		      
    		     }
    		    }
    		   }
    		   System.out.println();
    		  }
    		 }
   }