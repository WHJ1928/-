package 作业;

public class Constructor {
	 public static void main(String[] args)
	    {
	        Person2 p=new Person2("zhangsan",33,1.83);
	        Person2 q=new Person2("lisi",44,1.74);
	        Person2 w = new Person2();
	        
	        
	    }
	}
	class Person2
	{
	    String name;
	    int age;
	    double height;
	    
	    public Person2(){
	    	
	    }
	    
	    public Person2(String n,int a,double h)
	    {
	        name=n;
	        age=a;
	        height=h;
	    }
	    
	    public void sayHello()
	    {
	        System.out.println("大家好, my name is "+name);
	    }    

}
