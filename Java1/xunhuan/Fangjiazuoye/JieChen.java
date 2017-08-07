package Fangjiazuoye;

import java.util.Scanner;

public class JieChen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个数：\n");
		Scanner sc=new Scanner(System.in);
		int a=1;
		double b=1;
		int x=sc.nextInt();
		double y=sc.nextDouble();
		for(int i=1;i<=x;i++) {
			a=a*i;
		}
		System.out.println(a);
		for(int i=1;i<=y;i++) {
			b=b*i;
		}
		System.out.println(b);
	}

}
