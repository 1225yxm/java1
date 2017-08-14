package 案例_选择题案例;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//第一道题单选题
		String t1 = "以下说法错误的是? ";
		//单选题的四个选项
		Option so1 = new Option('A', "==可用于基本类型数据的比较");
		Option so2 = new Option('B', "equals()  可用于引用 类型数据的比较");
		Option so3 = new Option('C', "intanseOf 可用于判断对象的类型");
		Option so4 = new Option('D', "String 是基本数据类型");
		Option[] sOptions = { so1, so2, so3, so4 };
		//代表  此题的正确答案是 D
		char singleAnswer = 'D';

		//题目
		Question s1 = new SingleQuestion(t1, sOptions , 0, singleAnswer);

		//第二道题多选题

		String t2 = "关于 集合 以下说法正确的是? ";

		Option mo1 = new Option('A', "ArrayList比数组好用");
		Option mo2 = new Option('B', "comparable 接口提供了排序功能");
		Option mo3 = new Option('C', "iterator 是类");
		Option mo4 = new Option('D', "Map继承自 Collection ");
		Option[] mOptions = { mo1, mo2, mo3, mo4 };
		//正确答案的数组 
		char[] multiAnswer = { 'A','B' };

		//第二题创建完成
		Question m1 = new MultiQuestion(t2, mOptions , 1 , multiAnswer);

		//题目
		Question[] questions = { s1, m1 };


		/////////////////////
		// 显示题目并且输入答案检索
		QuestionHandler handler = new QuestionHandler();
		handler.showQuestion(questions);

	}

}
