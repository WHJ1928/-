package 作业;

public class 矩形类 {
	public class Rectangle
	{
	    int width;
	    int height;

	    public Rectangle()
	    {
	    }
	    public Rectangle(int width,int height)
	    {
	    	this.width=width;
	        this.height=height;
	    }
	    
	    public double getArea()
	    {
	        return this.width*this.height;
	    }
	    public double getPer()
	    {
	        return 2*(this.width+this.height);
	    }
	    public void showAll()
	    {
	        System.out.println("Width="+this.width);
	        System.out.println("Height="+this.height);
	        System.out.println("Area="+this.getArea());
	        System.out.println("Per="+this.getPer());
	    }
	}

}
