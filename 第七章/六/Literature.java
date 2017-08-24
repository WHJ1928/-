package 六;

public class Literature extends Stu{//文学
	    private double lecture;
	    private double production;//作品
	    public double add(){
	    	grade = lecture*0.35+production*0.35+midterm*0.15+examination*0.15;
	    	return grade;
	    }
}
