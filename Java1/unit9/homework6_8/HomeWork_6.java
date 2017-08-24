package homework6_8;

import java.util.Scanner;

import org.apache.commons.lang3.ObjectUtils.Null;

public class HomeWork_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//第六题：
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("请输入一个字符串：");
//		String string=scanner.next();
//		String string1=string;
//		System.out.println("请再输入一个字符串：");
//		String str=scanner.next();
//		int count=0;
//		do {
//			if(string.indexOf(str)!=-1) {
//				count++;
//			}
//			string=string.substring(string.indexOf(str)+str.length());
//		}while(string.length()>=str.length());
//		
//		System.out.println("“"+str+"“"+"在"+"“"+string1+"“"+"中出现的次数："+count);

		
		
		//第七题：
		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("请输入一个字符串：");
//		String string=scanner.next();
//		int c=0,e=0,m=0;
//		char [ ] chars=string.toCharArray();
//		
//		for(int i=0;i<chars.length;i++) {	
//			if(chars[i]>=48&&chars[i]<=57) {
//				m++;
//			}else if((chars[i]>=65&&chars[i]<=90)||(chars[i]>=97&&chars[i]<=122)) {
//				e++;
//			}else {
//				c++;
//			}	
//		}
//		
//		System.out.println("中文字符："+c);
//		System.out.println("英文字符："+e);
//		System.out.println("数字字符："+m);
		
		
		//第八题
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个数字字符串：");
		String string0=scanner.next();
		StringBuilder string1=new StringBuilder();
		string1.append(string0);
		StringBuilder string2=string1.reverse();
		if(string1==string2) {
			System.out.println(string0+"是回文数");
		}
		else {
			System.out.println(string0+"不是回文数");
		}
	}

}
