package ��װ;

public class TestEMP {
   public static void main(String[] args){
	   Person bao = new Person();
	      bao.setName("�ο�");
	      bao.setAge(28);
	      bao.setWeChat("��ι��ȭ����");
	      bao.setPosition("����������");
	   Salary ren = new Salary();
	      ren.setBase(150.03);
	      ren.setMerit(70.02);
	      ren.setOvertime(30.05);
	      
   }
   public static double add(double base,double merit,double overtime){
		return base+merit+overtime;
	}
}
