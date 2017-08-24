package Èý;

public abstract class Shape {
       public double area;
       public double per;
       public String color;
       
       public Shape(){
    	   
       }
       public Shape(String color){
    	   this.color = color;
       }
      public abstract double getArea();
      public abstract double getPer();
      public abstract void showAll();
      public  void getColor(){
    	  
      }
}
