package 二;

public class Vehicle {
     public static String brand;
     public static String color;
     public static double speed;
     
     public Vehicle(){
    	 
     }
     public Vehicle(String brand,String color,double speed){
    	 Vehicle.brand = brand;
    	 Vehicle.color = color;
    	 Vehicle.speed = 0;
     }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		Vehicle.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		Vehicle.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		Vehicle.speed = speed;
	}

	public static void run(String[] args){
    	 System.out.println("一辆汽车在奔驰");
     }
}
