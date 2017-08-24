package 数组;

public class 数组复制 {
    public static void main(String[] args){
    	String[] a={"neusofteducation"};
    	String[] b={""};
    	System.arraycopy(a,0,b,0,1);
    	     for(String x:b){  
    	 System.out.print(x);
    	     }
    }
}
