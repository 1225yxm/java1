package 封装继承多态案例考题类;

import java.util.Scanner;

//import java.nio.channels.NonWritableChannelException;

public class TestQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question[ ] question=new Question[3];
		
		//第一道题
		question[0]=new MultiChoice() ;
		MultiChoice multiChoice=(MultiChoice)question[0];
		multiChoice.setText("我们学过的课程有： ");
		String[ ] Moptions= {"1.java","  2.html ","3.c++"};
		multiChoice.setOptions(Moptions);
		int [ ] Manswers= {1,2};
		multiChoice.setAnswers(Manswers);
		
		//答题人的选项
		int[] Aanswers1= {1,1};
		multiChoice.check(Aanswers1);
		
		
		//第二道题
		question[1]=new MultiChoice() ;
		MultiChoice multiChoice2=(MultiChoice)question[1];
		multiChoice2.setText("我们学过的课程有： ");
		String[ ] Moptions2= {"1.java","  2.html ","3.c++"};
		multiChoice2.setOptions(Moptions2);
		int [ ] Manswers2= {1,3};
		multiChoice2.setAnswers(Manswers2);
		
		//答题人的选项
		int[] Aanswers2= {3,1};
		multiChoice2.check(Aanswers2);
		
		
		//第三道题
		question[2]=new SingleChoice();
		SingleChoice singleChoice1=(SingleChoice)question[2];
		singleChoice1.setText("我们的老师是谁？");
		String[ ] Soptions1= {"1。佳明","  2.贾明 ","3.没有正确选项"};
		multiChoice2.setOptions(Soptions1);
		int  Sanswers1= 2;
		singleChoice1.setAnswer(Sanswers1);
		
		//答题人的选项
		Scanner sc=new Scanner(System.in);
		int Aanswers3=sc.nextInt();
		singleChoice1.check(Aanswers3);

	}

}
