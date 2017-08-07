package function;

import java.util.Scanner;

public class FunctionFactorial {
	static int product=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*阶乘*/
		System.out.println("计算阶乘：");
		System.out.println("请输入一个数：");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		System.out.println(Factorial(x));
		
		
		/*判断闰年平年*/
		System.out.println("判断闰年平年");
		System.out.println("请输入年份：");
		Scanner R=new Scanner(System.in);
		int r=R.nextInt();
		judge(r);
		
		
		/*大于200的最小质数*/
		primenum();
		
		
		/*冒泡排序*/
		System.out.println("冒泡排序:");
		int array[]= {2,6,3,5,89,56,34,23,9};
		bubble(array);

	}
	
	static  int Factorial(int a) {
		for(int i=1;i<=a;i++) {
		
			product=product*i;
		}
		return product;
	}
	
	static void judge(int r) {
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
	
	
	static void primenum() {
		int a=0;
		for (int i=1;;i++) {
				for(int j=2;j<(i-2);j++) {
				a=i%j;
				if(a==0) break;
				else a=i;
			}
				
		 
			if (a>200) {
					System.out.println("大于200的最小质数："+a);break;
				}
		}
	}
	
	static void  bubble(int arr[]) {
		int temp=0;
		for(int i=0;i<=arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if (arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for (int k=0;k<arr.length;k++) {
			System.out.print(arr[k]);
			System.out.print('\t');
		}
		
	}
	

}
