package bank.myprojectbank;

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
			
			if(Character.isDigit(chars[i])) b1=true;
			else if(Character.isLowerCase(chars[i])) b2=true;
			else if(Character.isUpperCase(chars[i])) b3=true;
			else if(Character.getType(chars[i])==43)b4=true ;
			else if(Character.getType(chars[i]) == 23 ) b5=true;
			
		}
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
