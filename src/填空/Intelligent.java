package ���;

import ���.Answer;
import ���.Question1;

public class Intelligent {//���ܵ�

	// ����...
	public void doCheck(Question1[] questions, Answer[] answers) {

		System.out.println("�������Ϊ : ");

		String result = "";

		for (int i = 0; i < questions.length; i++) {

			if (questions[i].check(answers[i].getAnswer())) {  //���� Answer ��  , ������  ����������� 

				result = "��" + (i + 1) + " : �� ";
			} else {
				result = "��" + (i + 1) + " : �� ";
			}

			System.out.println(result);
		}

	}

	// ��ʾ��Ŀ..
	public void showQuestion1(Question1[] questions) {

		if (questions != null && questions.length > 0) { // ��Ϊ����ѭ�� , �Է� ��ָ���쳣  NullPointException
			for (int i = 0; i < questions.length; i++) {

				System.out.println("��Ŀ " + (i + 1) + " : " + questions[i].getStem());
				}
				System.out.println("***************************");

			}
		}

}
