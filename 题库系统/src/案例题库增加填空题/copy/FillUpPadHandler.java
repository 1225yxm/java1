package 案例题库增加填空题.copy;

import java.util.Scanner;

public class FillUpPadHandler {
	
	
	//显示题目
	public void showFillUpPad(FillUpPad[] fillUpPads) {
		FupAnswer[] answer= new FupAnswer[fillUpPads.length];//这里是为了18行的传参，与二维数组有关
		if (fillUpPads != null && fillUpPads.length > 0) { // 不为空在循环 , 以防 空指针异常  NullPointException
			for (int i = 0; i < fillUpPads.length; i++) {

				System.out.println("题目 " + (i + 1) + " : " + fillUpPads[i].getFuptitle());
				System.out.println("***************************");
				answer[i]=new FupAnswer(inputanswers());
			}
			doCheck(fillUpPads,answer);//检测答案是否正确
		}

	}
	
	
	//接收答案
	public String [ ][ ] inputanswers() {
//		int num=0;
		String  [][] answersarr=new String[10][30];//先创建一个比较大的数组容纳键盘输入的答案
		char input=' ';
		
		Scanner scanner=new Scanner(System.in);//键盘输入
		int i=0,j=0;
		do {//控制几个答案
			System.out.println("请输入答案：");
			 j=0;
			do {//控制每个答案的具体循环
			
			answersarr[i][j]=scanner.next();
			++j;
			if(answersarr[i][j]==null)break;
		}while(true);
//			System.out.println(j);
		++i;
		System.out.println("是否继续输入：Y    N");
//			Scanner scanner1=new Scanner(System.in);
			input=scanner.next().charAt(0);			
			if(input=='N')break;
			else continue;
		
		}while(true);
		
//		System.out.println(i);
		
		String [ ][ ] finalanswers=new String [i][j];//在上面接收后已经知道答题者输入答案的多少，创建一个与输入大小相同的数组
		for(int k=0;k<i;k++) {
			System.arraycopy(answersarr[k], 0, finalanswers[k], 0,j);
		}
//		System.out.print(i);
//		System.out.print(j);
//		for(int h=0;h<finalanswers.length;h++) {
//			for(int f=0;f<finalanswers[h].length;f++) {
//				System.out.print(finalanswers[h][f]);
//			}
//		}
		
		return finalanswers;
		
	}
	
	
	public void doCheck(FillUpPad[] fillUpPads, FupAnswer[] answers) {//这个方法是借鉴的老师的跟老师讲的选择提的判断方法一样

		System.out.println("测评结果为: ");

		String result = "";
		
		for (int i = 0; i < fillUpPads.length; i++) {
			//输出getchoice：
//			for(int h=0;h<answers[i].getDfupmchioce().length;h++) {
//				for(int f=0;f<answers[i].getDfupmchioce()[h].length;f++) {
//					System.out.print(answers[i].getDfupmchioce()[h][f]);
//				}
//			}
			
			if (fillUpPads[i].fupcheck(answers[i].getDfupmchioce())) {  //���� Answer ��  , ������  ����������� 
				
				result = "题" + (i + 1) + " : √ ";
			} else {
				result = "题" + (i + 1) + " : × ";
			}

			System.out.println(result);
		}

	}

}
