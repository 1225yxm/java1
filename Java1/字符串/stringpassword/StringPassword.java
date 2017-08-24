package stringpassword;

import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stubAB Cabc_123
		System.out.println("请输入密码");
		Scanner scanner=new  Scanner(System.in);
		String strings=scanner.next();
		Pasword pasword=new Pasword(strings);
		check checkp=new check(pasword);
		checkp.checkPassword();
		System.out.println(checkp.getlevel());

	}

}
