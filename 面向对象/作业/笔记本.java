package 作业;

public class 笔记本 {
	public class ComputeTest {

		public void main(String[] args) {
			Computer c1 = new Computer();
			c1.showComputer();
			Computer c2 = new Computer('红', 32);
			c2.showComputer();
		}

	}

	class Computer {
		private char color;
		private int cpuNum;

		public Computer() {

		}

		public Computer(char color, int cpuNum) {
			this.color = color;
			this.cpuNum = cpuNum;
		}

		public char getColor() {
			return color;
		}

		public void setColor(char color) {
			this.color = color;
		}

		public int getCpuNum() {
			return cpuNum;
		}

		public void setCpuNum(int cpuNum) {
			this.cpuNum = cpuNum;
		}

		public void showComputer() {
			System.out.println("笔记本的颜色:" + getColor());
			System.out.println("笔记本的CPU型号:" + getCpuNum());

		}
	}

}
