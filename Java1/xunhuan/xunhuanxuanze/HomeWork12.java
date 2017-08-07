package xunhuanxuanze;

import java.util.Scanner;

public class HomeWork12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入金额：\n");
		Scanner R=new Scanner(System.in);
		int a=R.nextInt();
		int h=0;
		if(a<100) {
			System.out.println("汇费为：1元");
		}else if(a>=100&&a<5000) {
			h=(int)(0.01*a);
			System.out.println("汇费为："+h+"元");
		}else if(a>=5000) {
			System.out.println("汇费为：50元");
		}

	}

}
