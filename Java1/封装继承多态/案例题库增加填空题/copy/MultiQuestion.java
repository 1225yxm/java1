package 案例题库增加填空题.copy;

import org.apache.commons.lang3.ArrayUtils;

public class MultiQuestion extends Question {

	public char[] answer; // 标准答案

	public MultiQuestion() {
	}

	public MultiQuestion(String title, Option[] options, int type, char[] answer) {
		super(title, options, type);
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

		if (customerChoice != null && customerChoice.length == answer.length) { // �𰸵ĸ�������ȷ�𰸵ĸ��� Ҫƥ��

			for (int i = 0; i < answer.length; i++) {

				flag = ArrayUtils.contains(customerChoice, answer[i]);

				if (!flag) break;
			}

		} else {
			flag = false;
		}

		return flag;
		
		
//		boolean  bn=false;
//		for(int i=0;i<customerChoice.length;i++) {
//			for(int j=i+1;j<customerChoice.length;j++) {
//				if(customerChoice[i]==customerChoice[j]) {
//					customerChoice=ArrayUtils.remove (answer,j);//去重
//				}
//			}
//		}
//		if (customerChoice.length==this.answer.length) {
//			for(int i=0;i<customerChoice.length;i++) {
//			for(int j=0;j<this.answer.length;j++) {
//				
//				if(customerChoice[i]==this.answer[j]) {
//					bn=true;	break;
//				}
//				else {
//					bn=false;
//				}
//		
//			}
//		}
//		}
//		else {
//			bn=false;
//		}
//		return bn;
	}

}
