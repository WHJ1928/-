package ���;

//import java.util.Scanner;

import ���.Answer;
//import ���.Gap;
import ���.Question1;
import ���.Intelligent;
import ���.Completion;

public class Text1 {

	public static void main( String[] gaps) {

		// ����һ�������
		//���
		String t1 = "1�� ��Java�У���ʵ�ֶ��ؼ̳�Ч���ķ�ʽ�� _____";
		String[] completionAnswer = {"ʵ�ֶ���ӿ�"};

		//��һ��  �������
		Question1 s1 = new Completion(t1,gaps,completionAnswer);

		/////////////// ��Ŀ
		Question1[] questions =  {s1} ;

		///////////
		// ��
//		Scanner a1= new Scanner(System.in);
//		String answer=  a1.nextLine();
		Answer answer1 = new Answer(new String[] {"ʵ�ֶ���ӿ�"});
		Answer[] answer = {answer1};
		

		/////////////////////
		// ��ʾ��Ŀ
		Intelligent auto = new Intelligent();
		auto.showQuestion1(questions);

		/////////////////////

//		System.out.println("�����");
		auto.doCheck(questions, answer);

	}

}


