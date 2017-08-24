package data;


import java.util.Date;

import javax.xml.crypto.Data;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		
		System.out.println(now);
		System.out.println(now.getTimezoneOffset());
		System.out.println(now.getTime());
		System.out.println(now.getDate());
		System.out.println(now.getMinutes());
		
		Date  d=new Date(2017-1900, 9,1);
		
		System.out.println(d);
		
		
		Date  d1=new Date();
		System.out.println(d1.getTime());
		
		long  t1=1503300979103l;
		
		Date d2=new Date(t1);
		System.out.println(d2);
		
		System.out.println(d2.before(d));
		
	}

}
