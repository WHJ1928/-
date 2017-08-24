package สýื้;

public class MaoPao {
//	static int count=0;
	 public static void main(String[] args){
    	int i,j;
    	int a[]={11,6,2,3,9,4,5,7,8,34,25,17};
    	for( i=0;i<a.length;i++){  
    	    for( j=0;j<a.length-1-i;j++){  
    	        if(a[j] > a[j+1]){  
    	            int temp = a[j];  
    	            a[j] = a[j+1];  
    	            a[j+1] = temp;  
    	        }   
    	    }  
    	}  
    	for(int x:a){  
    	    System.out.print(x+" ");  
    	}
    }

}
