package 密码;

import java.util.Scanner;

public class Password {
    private Grade grade;
    
	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public static void main(String[] args) {
//		for(){
		System.out.println("请输入密码:"+"(大于6位小于24位)");
		Scanner pass = new Scanner(System.in);
		String word=pass.nextLine();
		if(word.length()<6){
			System.out.println("密码必须大于6位，请重新输入");
		}else if(word.length()>24){
			System.out.println("密码必须小于24位，请重新输入");
		}else
	 System.out.println(word.replace(word,"**********"));
//		}
	}
}
