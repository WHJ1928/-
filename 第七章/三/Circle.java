package ��;

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
      	 System.out.println("���="+area+"\n"+"�ܳ�="+per+"\n"+"��ɫ="+color+"\n"+"�뾶="+radius);
       }     
}
