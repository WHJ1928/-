package 填空;

import 填空.Answer;
import 填空.Question1;

public class Intelligent {//智能的

	// 检查答案...
	public void doCheck(Question1[] questions, Answer[] answers) {

		System.out.println("测评结果为 : ");

		String result = "";

		for (int i = 0; i < questions.length; i++) {

			if (questions[i].check(answers[i].getAnswer())) {  //答案是 Answer 类  , 内容在  此类的数组里 

				result = "题" + (i + 1) + " : √ ";
			} else {
				result = "题" + (i + 1) + " : × ";
			}

			System.out.println(result);
		}

	}

	// 显示题目..
	public void showQuestion1(Question1[] questions) {

		if (questions != null && questions.length > 0) { // 不为空在循环 , 以防 空指针异常  NullPointException
			for (int i = 0; i < questions.length; i++) {

				System.out.println("题目 " + (i + 1) + " : " + questions[i].getStem());
				}
				System.out.println("***************************");

			}
		}

}
