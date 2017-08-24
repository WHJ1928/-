package study;

public class 百马百担 {
	 public static void main(String[] args) {

		 int d, z, x;
		 
		 for(d=0; d<=33; d++)
		  for(z=0; z<=50; z++)
		  {
		   x = 100-d-z;
		   if(d*3 + z*2 + 0.5*x == 100)
			   System.out.println(d+"只大马"+z+"只中马"+x+"只小马");
	   }
}
}
