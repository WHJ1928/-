package study;

public class Õý·½ÐÎ {
	    public static void main(String[] args)
	    {
	        int M, N;
	        int i, j;
	        M=N=15;
	        for(i=0;i<M;++i)
	        {
	            if(i==0 || i==M-1)
	            {
	                for(j=0;j<N;++j)
	                {
	                    System.out.print("*");
	                }
	            }
	            else
	            {
	                System.out.print("*");
	                for(j=0;j<N-2;++j)
	                {
	                    System.out.print(" ");
	                }
	                System.out.print("*");
	            }
	            System.out.println(" ");
	        }
	    }
	}
