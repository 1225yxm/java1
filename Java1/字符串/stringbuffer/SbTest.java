package stringbuffer;

public class SbTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [ ]  string=new String[5];
		string[0]="java";
		string[1]="c#";
		string[2]="c++";
		string[3]="english";
		string[4]="c";
		
	    String  [ ]string2=new String[5];
	    
	    for(int i=string.length-1;i>=0;i--) {
	    	string2[string.length-i-1]=string[i];
	    }
	    for (String s3 : string2) {
			 System.out.println(s3);
		}
	   
		
//	    String string0="java";
//	    String string1="c#";
//	    String string3="c++";
//	    String string4="english";
//	    String string5="c";
//	    
//		StringBuffer stringBuffer=new StringBuffer(string0);
//		String str=stringBuffer.toString();
//		
//		stringBuffer.reverse();
//		System.out.println(stringBuffer);

	}

}
