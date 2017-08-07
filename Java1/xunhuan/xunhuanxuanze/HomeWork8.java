package xunhuanxuanze;

import java.util.Scanner;

public class HomeWork8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入年份：\n");
		Scanner R=new Scanner(System.in);
		int r=R.nextInt();
		if(r%100!=0)
		{
			if(r%4==0)
			{
				System.out.println(r+"是闰年");
			}
			else {
				System.out.println(r+"不是闰年");
			}
		}
		else  {
			if(r%400==0)System.out.println(r+"是闰年");
			else System.out.println(r+"不是闰年");
		}

	}

}
