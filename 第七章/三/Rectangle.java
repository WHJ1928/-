package ��;

public class Rectangle extends Shape{
     public double width;
     public double height;
     public Rectangle(){
    	 
     }
     public Rectangle(double width,double height,String color){
    	 this.width = width;
    	 this.height = height;
    	 this.color = color;
     }
     public double getArea(){
    	 area = width*height;
    	 return area;
     }
     public double getPer(){
    	 per = 2*(width+height);
    	 return per;
     }
     public void showAll(){
    	 System.out.println("���="+area+"\n"+"�ܳ�="+per+"\n"+"��ɫ="+color+"\n"+"��="+width+"\n"+"��="+height);
     }     
}
