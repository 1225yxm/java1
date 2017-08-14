package 封装_homework4;

import java.time.Month;
import java.util.Calendar;

import javax.xml.crypto.Data;

public class ColaEmployee {
	private String name;
	private int month;
	
	
	public double getSalary(int month) {
		double salary=0;
		Calendar calendar=Calendar.getInstance();
		int nowmonth=calendar.get(Calendar.MONTH)+1;
		if(month==nowmonth) {
			salary=100;
		}
		return salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}



}
