package 数组;

public class 数组计算 {
	public static void main(String[] args){
		  int a[] = new int[]{ -10,23,246,-100,0,5};
			 int max = a[0]; int min = a[0];
			 int add = a[0]; int ave = a[0];
			 for(int i =1;i<a.length;i++){
				 if(a[i]< min){
					 min = a[i];
				 }else if(a[i]>max){
					 max = a[i];
				 }
				 add = add+a[i];
				 ave=add/a.length;
			 }
			System.out.println("平均值为："+ave+"    最小值是："+min+"    最大值是："+max);
	}
}
