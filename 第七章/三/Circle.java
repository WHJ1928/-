package 三;

public class Circle extends Shape{
       public double radius;
       
       public Circle(){
      	 
       }
       public Circle(double radius,String color){
      	 this.radius = radius;
      	 this.color = color;
       }
       public double getArea(){
      	 area = 3.14*radius*radius;
      	 return area;
       }
       public double getPer(){
      	 per = 2*3.14*radius;
      	 return per;
       }
       public void showAll(){
      	 System.out.println("面积="+area+"\n"+"周长="+per+"\n"+"颜色="+color+"\n"+"半径="+radius);
       }     
}
