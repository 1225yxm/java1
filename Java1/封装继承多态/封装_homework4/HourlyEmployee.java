package 封装_homework4;

public class HourlyEmployee extends ColaEmployee {
	private double salaryforhour;
	private int howhour;
	

	public double getSalaryforhour() {
		return salaryforhour;
	}

	public void setSalaryforhour(double salaryforhour) {
		this.salaryforhour = salaryforhour;
	}

	public int getHowhour() {
		return howhour;
	}

	public void setHowhour(int howhour) {
		this.howhour = howhour;
	}

	public double getSalary(int month) {
		double salary=super.getSalary(month);
		if(howhour>160) {
			salary=salary+(160*salaryforhour+(howhour-160)*salaryforhour*1.5);
		}else {
			salary=salary+howhour*salaryforhour;
		}
		return salary;
	}
}
