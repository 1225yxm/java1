package stringpassword;

public class check {
	
	private  Pasword pasword;
	 boolean b1 = false;
	 boolean b2 = false;
	 boolean b3 = false;
	 boolean b4 = false;
	 boolean b5=false;
	
	public check(Pasword pasword) {
		this.pasword=pasword;
	}
	
	public void checkPassword() {
		char [ ] chars=pasword.getStrings().toCharArray();
		
		
		for(int i=0;i<chars.length;i++) {
//			if(chars[i]>=32&&chars[i]<=126) {
//				if(chars[i]>=48&&chars[i]<=57) {
//				b1=true;
//				}else if(chars[i]>=65&&chars[i]<=90) {
//				b2=true;
//				}else if(chars[i]>=97&&chars[i]<=122) {
//					b3=true;
//				}else {
//					b4=true;
//				}
//			}else {
//				System.out.println("密码中包含非法字符！");break;
//			}
			
			if(Character.isDigit(chars[i])) b1=true;
			else if(Character.isLowerCase(chars[i])) b2=true;
			else if(Character.isUpperCase(chars[i])) b3=true;
			else if(Character.getType(chars[i])==43)b4=true ;
			else if(Character.getType(chars[i]) == 23 ) b5=true;
			
		}
		
//		System.out.println("b1:"+b1);
//		System.out.println("b2:"+b2);
//		System.out.println("b3:"+b3);
//		System.out.println("b4:"+b4);
	
//		 if(b1&&b2&&b3&&b4) {
//				System.out.println("密码强度五颗星");
//			}else if((b1&&b2&&b3)||(b1&&b2&&b4)||(b4&&b2&&b3)) {
//				System.out.println("密码强度四颗星");
//			}else if((b1&&b2)||(b1&&b3)||(b1&&b4)||(b2&&b3)||(b4&&b3)) {
//				System.out.println("密码强度三颗星");
//			}else if(b1||b2||b3||b4) {
//				System.out.println("密码过于简单，建议重新输入！");
//			}	
	}
	
	public String getlevel() {
		String str =new String();
		if(b1) str+="*";
		if(b2) str+="*";
		if(b3) str+="*";
		if(b4) str+="*";
		if(b5) str+='*';

		return str;
	}



}
