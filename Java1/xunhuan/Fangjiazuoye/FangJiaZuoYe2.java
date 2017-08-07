package Fangjiazuoye;

import java.util.Scanner;

public class FangJiaZuoYe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入本金：\n");
		Scanner R=new Scanner(System.in);
		double x=R.nextDouble();
		int i=0;
		for(;i<5;i++)
		{
			x=x*(1+0.003);
		}
		System.out.println("五年后的本金为："+x);

	}

}
