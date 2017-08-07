package xunhuanxuanze;

import java.util.Scanner;

public class HomeWork10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入3个整数：\n");
		Scanner R=new Scanner(System.in);
		int a=R.nextInt();
		int b=R.nextInt();
		int c=R.nextInt();
		int min=0,mid=0,max=0;
		
		if (a>b) {
			min=b;
			max=a;
		}else {
			min=a;
			max=b;
		}
		if(min<c) {
				System.out.println(min);
			}else {
				min=c;
				System.out.println(min);
			}
		if(max>c)
		{
			mid=c;
			System.out.println(mid);
			System.out.println(max);
		}else {
			mid=max;
			max=c;
			System.out.println(mid);
			System.out.println(max);
		}
		
				

	}

}
