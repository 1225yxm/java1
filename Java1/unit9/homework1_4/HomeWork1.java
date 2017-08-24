package homework1_4;

import java.util.Scanner;

import javax.naming.event.NamespaceChangeListener;

import org.apache.commons.lang3.ArrayUtils;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//第一题
//		Scanner scanner= new Scanner(System.in);
//		System.out.println("请输入两个字符串：");
//		String  string1=scanner.next();
//		String  string2=scanner.next();
//		int temp=Integer.parseInt(string1)+Integer.parseInt(string2);
//		System.out.println(temp);
		
		
		//第二题
//		Scanner scanner= new Scanner(System.in);
//		System.out.println("请输入一个字符串：");
//		int k=0;
//		String  string1=scanner.next();
//		String s="e";
//		char[ ] chars=string1.toCharArray();
//		for(int i=0;i<chars.length;i++) {
//			if(chars[i]=='e') {
//				k++;
//			}
//		}
//		System.out.println("e在该字符串中出现的次数："+k);
		
		//第三题
//		int[ ]array=new int [10];
//		for(int i=0;i<array.length;i++) {
//			array[i]=(int)(Math.random()*100);
//		}
//		
//		for(int i=0;i<array.length;i++) {
//			for(int j=0;j<array.length-1;j++) {
//				if(array[j]<array[j+1]) {
//					int temp=0;
//					temp=array[j+1];
//					array[j+1]=array[j];
//					array[j]=temp;
//				}
//			}
//		}
//		
//		for (int i : array) {
//			System.out.println(i);
//		}
		
		
		
		//第四题
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("请输入北京时间：");
		String  string1=scanner.next();
		int h=string1.indexOf(":");
		String strh=string1.substring(0,h);
		String strs=string1.substring(h);
		int hour=Integer.parseInt(strh);
		if(hour>=7) {
			String prisetime=(hour-7)+strs;
			System.out.println("prisetime:"+prisetime);
		}else {
			String prisetime=(24-7+hour)+strs;
			System.out.println("prisetime:"+prisetime);
		}
		
		if(hour>=12 ){
			String newyorktime=(hour-12)+strs;
			System.out.println("newyorktime:"+newyorktime);
		}else {
			String newyorktime=(24-12+hour)+strs;
			System.out.println("newyorktime:"+newyorktime);
		}
	}

}
