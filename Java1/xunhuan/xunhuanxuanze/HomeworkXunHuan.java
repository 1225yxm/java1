package xunhuanxuanze;

import java.util.Scanner;

public class HomeworkXunHuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println("请输入利润：\n");
		Scanner r=new Scanner(System.in);
		double l=r.nextDouble();
		int a=0;
		double  j[]= {0,0,0,0,0,0 };
		if(l<=100000)
		{
			j[0]=l*0.1;		
			System.out.println("发放奖金总数为："+j[0]);
		}
		else if(l>100000 && l<=200000)
		{
			j[1]=100000*0.1+(l-100000)*0.075;
			System.out.println("发放奖金总数为："+j[1]);
		}
		else if(l>200000 && l<=400000)
		{
			j[2]=100000*(0.1+0.075)+(l-200000)*0.05;
			System.out.println("发放奖金总数为："+j[2]);
		}
		
		else if(l>400000 && l<=600000)
		{
			j[3]=100000*(0.1+0.075+0.05)+(l-200000)*0.03;
			System.out.println("发放奖金总数为："+j[3]);
		}
		else if(l>600000 && l<=1000000)
		{
			j[4]=100000*(0.1+0.075+0.05+0.03)+(l-600000)*0.015;
			System.out.println("发放奖金总数为："+j[4]);
		}
		else if(l>1000000 )
		{
			j[5]=100000*(0.1+0.075+0.05+0.03+0.015)+(l-1000000)*0.01;
			System.out.println("发放奖金总数为："+j[5]);
		}
		*/
		
		System.out.println("请输入利润：\n");
		Scanner R=new Scanner(System.in);
		double r=R.nextDouble();
		double jr=0;
		int a=(int) (r/100000);
		switch(a) {
		case 0 : jr=r*0.1;break;
		case 1: jr=100000*0.1+(r-100000)*0.075;break;
		case 2 :
		case 3 :
		case 4 :jr=100000*(0.1+0.075)+(r-200000)*0.05 ;break;
		case 5 :
		case 6 :jr=100000*(0.1+0.075+0.05)+(r-200000)*0.03 ;break;
		
		case 10 :jr=100000*(0.1+0.075+0.05+0.03)+(r-600000)*0.015 ;break;
		default :jr=100000*(0.1+0.075+0.05+0.03+0.015)+(r-1000000)*0.01;break;
		}
		
		System.out.println("发放奖金总数为："+jr);
		
		

	}

}
