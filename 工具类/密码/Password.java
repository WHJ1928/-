package ����;

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
		System.out.println("����������:"+"(����6λС��24λ)");
		Scanner pass = new Scanner(System.in);
		String word=pass.nextLine();
		if(word.length()<6){
			System.out.println("����������6λ������������");
		}else if(word.length()>24){
			System.out.println("�������С��24λ������������");
		}else
	 System.out.println(word.replace(word,"**********"));
//		}
	}
}
