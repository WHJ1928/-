package study;

public class 年利率 {
	public static void main(String[] args) {
		double x=2000;; // 本金
        for (int j = 1; j <= 5; j++) {
            x *= 1+0.003;
        }
        System.out.println("五年后本金是"+(int)x);
    }
}
