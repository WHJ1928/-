package 作业;

public class Stu {
	public class Student {
		private String name;
		private String number;
		private int score;
		
		public Student() {

		}

		public Student(String name, String number, int score) {
			this.name = name;
			this.number = number;
			this.score = score;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

		public void sortByScore(Student[] students){
			for(int i =0 ;i<students.length;i++){
				for(int j = 0;j<students.length;j++){
					if(students[i].getScore()>students[j].getScore()){
						Student b = students[i];
						students[i] = students[j];
						students[j] = b;
					}
				}
			}
			System.out.println("按成绩排序后的结果如下:");
			for(int i = 0 ;i<students.length;i++){
				System.out.print(students[i].getName() + " "+ students[i].getNumber()+" "+students[i].getScore());
				System.out.println();
			}
		}

	}
	public class StudentTest {

		public void main(String[] args) {
			Student s1= new Student("Kitty","0000001",70);
			Student s2= new Student("Dingdang","0000002",85);
			Student s3= new Student("Tom","0000003",60);
			Student[] students = new Student[]{s1,s2,s3};
			Student s = new Student();
			s.sortByScore(students);

		}

	}

}
