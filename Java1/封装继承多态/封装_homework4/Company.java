package 封装_homework4;

import java.util.Calendar;

public class Company {
	
	static Calendar calendar=Calendar.getInstance();
	static int nowmonth=calendar.get(Calendar.MONTH)+1;
	
	public static void showall( ColaEmployee emp) {
		System.out.println(nowmonth+"月"+emp.getName()+"(生日月份："+emp.getMonth()+")"+"的薪资为："+emp.getSalary(emp.getMonth()));
	}
}
