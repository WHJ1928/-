package 二;

public class Car extends Vehicle{
     private static int loader;
     
     public Car(){
    	 
     }
     public Car(int loader,String color,String brand,double speed){
    	 Car.loader = loader;
     }
	public int getLoader() {
		return loader;
	}

	public void setLoader(int loader) {
		Car.loader = loader;
	}
	
	public static void run(String[] args){
   	 System.out.println("一辆载着"+loader+"个人的"+color+"色的"+brand+"汽车在以"+speed+"迈的速度飙车");
    }
}
