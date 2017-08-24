package 考题;


import org.apache.commons.lang3.ArrayUtils;

import 考题.Option;

public class Multi extends Question{
	public char[] answer; // 正确答案

	public Multi() {
	}

	public Multi(String title, Option[] options, int type, char[] answer) {
		super(title, options,type);
		this.answer = answer;
	}

	public char[] getAnswer() {
		return answer;
	}

	public void setAnswer(char[] answer) {
		this.answer = answer;
	}

	@Override
	public boolean check(char[] customerChoice) {
		boolean flag = true; //

		if (customerChoice != null && customerChoice.length == answer.length) { // 答案的个数和正确答案的个数 要匹配

			for (int i = 0; i < answer.length; i++) {

				flag = ArrayUtils.contains(customerChoice, answer[i]);

				if (!flag) break;
			}

		} else {
			flag = false;
		}

		return flag;
	}
}
