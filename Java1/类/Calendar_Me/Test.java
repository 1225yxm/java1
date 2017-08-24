package Calendar_Me;

import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar  c1=Calendar.getInstance();
		System.out.println(c1);
		Date d1=c1.getTime();
		System.out.println(d1);
		
//		System.out.println(c1.getTimeInMillis());
//		System.out.println(c1.getFirstDayOfWeek());
//		System.out.println(c1.getCalendarType());
//		System.out.println(c1.getWeekYear());
//		System.out.println(c1.get(Calendar.AM_PM));
//		System.out.println(c1.get(Calendar.DAY_OF_WEEK));
//		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
//		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
//		System.out.println(c1.get(Calendar.FRIDAY));
		System.out.println(c1.get(Calendar.JANUARY));
		System.out.println(c1.get(Calendar.JULY));
		
	}

}
