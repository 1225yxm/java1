package xunhuanxuanze;

import java.util.Scanner;

public class HomeWork7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个数：\n");
		Scanner R=new Scanner(System.in);
		int r=R.nextInt();
		if (r%5==0&&r%6!=0) {
			System.out.println("能被5整除");
		}
		else if(r%6==0&&r%5!=0) {
			System.out.println("能被6整除");
		}
		if(r%5==0&&r%6==0)
		{
			System.out.println("能被5和6整除");
		}
		else if(r%5!=0&&r%6!=0) {
			System.out.println("不5能被5和6整除");
		}

	}

}
