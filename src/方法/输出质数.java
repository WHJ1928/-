package ����;

public class ������� {
	public static void main(String[] args) {
		�������.suan();
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
