package study;

public class ·¿×Ó1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 6; j++) {
				System.out.print("*");

			}
			for (int b = 2; b <= i*2-1; b++) {
				System.out.print(" ");
			}
			for (int b = 1; b <= 1; b++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=7;a<=11;a++){
			for(int b=1;b<=17;b++){

			    if(a==7||a==11||b==1||b==17)
			    System.out.print("*");
			    else{
			    	System.out.print(" ");	
			    }
			}System.out.println();
		}
		
	}

}

