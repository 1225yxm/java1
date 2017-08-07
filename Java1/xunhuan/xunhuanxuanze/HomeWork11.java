package xunhuanxuanze;

import java.util.Scanner;

public class HomeWork11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入1个不多于5位的整数：\n");
		Scanner R=new Scanner(System.in);
		int a=R.nextInt();
		int b=a;
		int s[]= {0,0,0,0,0};
		int y=0,k=0,i=0;
		for( i=0;i<5;i++)
		{
			y=a/10;
			s[i]=a%10;
			a=y;
			if(s[i]==0&&y==0) {
				break;
				
				
			}
		}
		
		System.out.println(b+"是一个"+i+"位数");
		for(;i>0;i--) {
			System.out.print(s[i-1]);
		}

	}

}
