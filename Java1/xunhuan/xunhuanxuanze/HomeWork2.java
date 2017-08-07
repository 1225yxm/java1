package xunhuanxuanze;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		System.out.println("请输入成绩：\n");
		Scanner R=new Scanner(System.in);
		double r=R.nextDouble();
		if(r>100||r<0) {
			System.out.println("输入的成绩无效");
		}else {
			a=(int)(r/10);
		switch(a) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5: System.out.println('E');break;
		case 6:System.out.println('D');break;
		case 7:System.out.println('C');break;
		case 8:System.out.println('B');break;
		case 9: 
		case 10:System.out.println('A');break;
		}
		}
		

	}

}
