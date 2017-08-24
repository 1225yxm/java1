package homework5;

import java.util.Scanner;

public class Mailtest {
	
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("请输入邮箱地址：");
	String string0=scanner.next();
	
	if(string0.indexOf('@')!=-1&&string0.indexOf('.')!=-1) {
		if(string0.indexOf('@')==string0.lastIndexOf('@')||string0.indexOf('.')==string0.lastIndexOf('.')) {
			if(string0.indexOf('@')<string0.indexOf('.')) {
			if (string0.endsWith(".com")) {
				System.out.println("用户名："+string0.substring(0, string0.indexOf('@')));
				System.out.println("域名：："+string0.substring(string0.indexOf('@')+1,string0.indexOf('.') ));
			}else {
			System.out.println("邮箱必须以.com结尾");
		}
			
		}else {
			System.out.println("邮箱地址不正确，@和.的位置不对");
		}
		}else System.out.println("包含的@或.太多了！"); 
	}else {
		System.out.println("邮箱地址不正确，没有包含@或.");
	}
	
}
}
