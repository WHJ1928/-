package 填空;

//import java.util.Scanner;

import 填空.Answer;
//import 填空.Gap;
import 填空.Question1;
import 填空.Intelligent;
import 填空.Completion;

public class Text1 {

	public static void main( String[] gaps) {

		// 构造一个填空题
		//题干
		String t1 = "1、 在Java中，能实现多重继承效果的方式是 _____";
		String[] completionAnswer = {"实现多个接口"};

		//第一题  构造完成
		Question1 s1 = new Completion(t1,gaps,completionAnswer);

		/////////////// 题目
		Question1[] questions =  {s1} ;

		///////////
		// 答案
//		Scanner a1= new Scanner(System.in);
//		String answer=  a1.nextLine();
		Answer answer1 = new Answer(new String[] {"实现多个接口"});
		Answer[] answer = {answer1};
		

		/////////////////////
		// 显示题目
		Intelligent auto = new Intelligent();
		auto.showQuestion1(questions);

		/////////////////////

//		System.out.println("检测结果");
		auto.doCheck(questions, answer);

	}

}


