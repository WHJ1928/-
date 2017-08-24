package singleton;

public class Scanner {
//¶öººÊ½
	 private static Scanner scanner = new Scanner();
	 private Scanner(){
		 
	 }
	 public static Scanner getInstance(){
		 return scanner;
	 }
}
