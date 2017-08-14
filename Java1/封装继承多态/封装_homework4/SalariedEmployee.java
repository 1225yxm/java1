package 封装_homework4;

public class SalariedEmployee extends ColaEmployee {
	private double salary;


	public double getSalary(int month) {
		salary=(salary+super.getSalary(month));
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
