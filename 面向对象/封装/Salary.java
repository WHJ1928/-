package 封装;

public class Salary {
	  private double base;//基本工资
	  private double merit;//绩效工资
	  private double overtime;//加班费
	  private double total;//总工资
	  
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getMerit() {
		return merit;
	}
	public void setMerit(double merit) {
		this.merit = merit;
	}
	public double getOvertime() {
		return overtime;
	}
	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
//	public static double total(double base,double merit,double overtime){
//		return base+merit+overtime;
//	}
//	public static void main(String[] args){
//		total=add;
//	}
}
