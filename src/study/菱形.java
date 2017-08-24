package study;

public class 菱形 {
	public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < Math.abs(5 - i); j++) {//Math.abs()该函数用于取绝对值
                System.out.print(" ");
            }
            for (int k = 0; k < (5 - Math.abs(5 - i)); k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
