package 案例_选择题案例;

import java.util.Scanner;

public class QuestionHandler {

	// ����...
	public void doCheck(Question[] questions, Answer[] answers) {

		
		
		System.out.println("测评结果为: ");

		String result = "";
		
		for (int i = 0; i < questions.length; i++) {
			//输出getchoice：
//			for (char answer : answers[i].getChoice()) {
//					System.out.println(answer);
//				}
			if (questions[i].check(answers[i].getChoice())) { 
				
				result = "题" + (i + 1) + " : √ ";
			} else {
				result = "题" + (i + 1) + " : × ";
			}

			System.out.println(result);
		}

	}

	
	// 输出题目
	public void showQuestion(Question[] questions) {
		Answer[] answer= new Answer[questions.length];
		if (questions != null && questions.length > 0) { // 不为空在循环 , 以防 空指针异常  NullPointException
			for (int i = 0; i < questions.length; i++) {

				System.out.println("题目 " + (i + 1) + " : " + questions[i].getTitle());
				for (Option option : questions[i].getOptions()) {
					System.out.println(option.getKey() + " . " + option.getText());
				}
				System.out.println("***************************");
			//	Answer answer1 = new Answer(inputanswers());
				answer[i]=new Answer(inputanswers());
//				Answer[] answer= { answer1};
			}
			
			doCheck(questions,answer);
		}

	}
	
	
	public char[] inputanswers() {
		int num=0;
		char [] answersarr=new char[4];
		char input='n';
		
		Scanner scanner=new Scanner(System.in);
		int i=0;
		do {
			System.out.println("请输入答案：");
			answersarr[i]=scanner.next().charAt(0);
			++i;
			System.out.println("是否继续输入：Y    N");
			input=scanner.next().charAt(0);
			//清除键盘缓冲区
			
			if(input=='N')break;
			else continue;
		}while(true);
//		System.out.println(i);
		char [ ] finalanswers=new char [i];
		System.arraycopy(answersarr, 0, finalanswers, 0, i);
//		for (char c : finalanswers) {
//			System.out.println(c);
//		}
		
		return finalanswers;
		
	}

}
