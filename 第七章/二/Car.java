package ��;

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
   	 System.out.println("һ������"+loader+"���˵�"+color+"ɫ��"+brand+"��������"+speed+"�����ٶ�쭳�");
    }
}
