package 方法;

public class 冒泡排序 {
	public static void main(String[] args) {
		int[] array = { 1, 6, 2, 3, 9, 4, 5, 7, 8 };
		sort(array);
		print(array);
	}

	public static void sort(int[] data) {
		// 数组长度 　　
		int len = data.length;
		int temp = data[0]; // 临时变量
		for (int i = 1; i < len; i++) {
			for (int j = 1; j <len-i; j++) {
				// 如果data[j+1]大于data[j]，交换 　　
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}

	// 数组打印　
	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.print("\n");
	}

}
