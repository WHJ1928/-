package singleton;

public class Scanner1 {
	//¿¡∫∫ Ω
    private static Scanner1 scanner;

	private Scanner1() {

	}
	public static Scanner1 getInstance(){
		if(scanner == null){
			scanner = new Scanner1();			
		}
		return scanner;
	}
      
}
