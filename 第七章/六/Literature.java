package ��;

public class Literature extends Stu{//��ѧ
	    private double lecture;
	    private double production;//��Ʒ
	    public double add(){
	    	grade = lecture*0.35+production*0.35+midterm*0.15+examination*0.15;
	    	return grade;
	    }
}
