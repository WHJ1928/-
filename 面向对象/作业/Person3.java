package 作业;

public class Person3 {
	 private String name;
	    private int age;
	    private double height;
	    
	    public Person3(String name,int age)
	    {
	        this.name=name; //此处如果不用this会出现问题
	        this.age=age;
	    }
	    public void sayHello()
	    {
	        System.out.println("Hello, my name is "+name);
	    }
	    public static void main(String args[]){
	    	Person3 p = new Person3("a",1);
	    	p.sayHello();
	    }

}
