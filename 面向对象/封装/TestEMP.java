package 封装;

public class TestEMP {
   public static void main(String[] args){
	   Person bao = new Person();
	      bao.setName("任俊");
	      bao.setAge(28);
	      bao.setWeChat("我喂阿拳带盐");
	      bao.setPosition("保安部经理");
	   Salary ren = new Salary();
	      ren.setBase(150.03);
	      ren.setMerit(70.02);
	      ren.setOvertime(30.05);
	      
   }
   public static double add(double base,double merit,double overtime){
		return base+merit+overtime;
	}
}
