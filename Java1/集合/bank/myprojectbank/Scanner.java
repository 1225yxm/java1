package bank.myprojectbank;

public class Scanner {
	
	private static java.util.Scanner myScanner;
	
	private Scanner() {
		
	}

	public static java.util.Scanner getInstance() {
		if(myScanner==null) {
			myScanner=new java.util.Scanner(System.in);
		}
		return myScanner;
	}

}
