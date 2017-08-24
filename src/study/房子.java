package study;

public class ·¿×Ó {

       public static void main(String[] args){
   		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 6; j++) {
				System.out.print("*");

			for (int k = 2; k <= i*2-1; k++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 1; k++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
    	   int A,B;
    	   int a,b;
    	   A=B=18;
    	   for(a=0;a<A;++a)
    	   {
    		   if(a==0 || a==A-1)
    		   {
    			   for(b=0;b<B;++b)
    			   {
    				   System.out.print("*");
    			   }
    		   }
    		   else
    		   {
    			   System.out.print("*");
    			   for(b=0;b<B-2;++b)
    			   {
    				   System.out.print(" ");
    			   }
    			   System.out.print("*");
    		   }
    		   System.out.println(" ");
    	   }
    		   
       }
}
       }
