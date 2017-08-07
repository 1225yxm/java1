package xunhuanxuanze;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个整型数：\n");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		if(r%2==0) {
			System.out.println("这个数为偶数");
		}
		else {
			System.out.println("这个数为奇数");
		}

	}

}
