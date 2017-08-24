package 三;

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
    	 System.out.println("面积="+area+"\n"+"周长="+per+"\n"+"颜色="+color+"\n"+"宽="+width+"\n"+"高="+height);
     }     
}
