package xunhuanxuanze;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个变量：\n");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		switch(r) {
		case 1:System.out.println("x=1");break;
		case 5:System.out.println("x=5");break;
		case 10:System.out.println("x=10");break;
		default:System.out.println("x=none");
		break;
		}
	}

}
