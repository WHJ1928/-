package singleton;

public class Scanner {
//����ʽ
	 private static Scanner scanner = new Scanner();
	 private Scanner(){
		 
	 }
	 public static Scanner getInstance(){
		 return scanner;
	 }
}
