package ����;

public class ð������ {
	public static void main(String[] args) {
		int[] array = { 1, 6, 2, 3, 9, 4, 5, 7, 8 };
		sort(array);
		print(array);
	}

	public static void sort(int[] data) {
		// ���鳤�� ����
		int len = data.length;
		int temp = data[0]; // ��ʱ����
		for (int i = 1; i < len; i++) {
			for (int j = 1; j <len-i; j++) {
				// ���data[j+1]����data[j]������ ����
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}

	// �����ӡ��
	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.print("\n");
	}

}
