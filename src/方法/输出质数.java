package 方法;

public class 输出质数 {
	public static void main(String[] args) {
		输出质数.suan();
	}
	
	public static void suan() {
		for (int i = 200; i < 300; i++) {
			boolean b = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (!b) {
				continue;
			}
			System.out.println(i);
			break;
		}
	}

}
