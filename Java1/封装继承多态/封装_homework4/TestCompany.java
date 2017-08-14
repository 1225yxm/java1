package 封装_homework4;

public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaEmployee[ ] colaEmployees=new ColaEmployee[3];
		
		//小时工
		colaEmployees[0] = new HourlyEmployee();
		HourlyEmployee hourlyEmployee=(HourlyEmployee)colaEmployees[0];
		hourlyEmployee.setName("hourlyemployee");
		hourlyEmployee.setMonth(8);
		hourlyEmployee.setHowhour(170);
		hourlyEmployee.setSalaryforhour(20);
		
		//基本薪资
		colaEmployees[1]=new SalariedEmployee();
		SalariedEmployee salariedEmployee=(SalariedEmployee)colaEmployees[1];
		salariedEmployee.setName("salariedemployee");
		salariedEmployee.setMonth(4);
		salariedEmployee.setSalary(5000);
		
		//薪资按照提成计算
		colaEmployees[2]=new SalesEmployee();
		SalesEmployee salesEmployee=(SalesEmployee)colaEmployees[2];
		salesEmployee.setName("salesemployee");
		salesEmployee.setMonth(8);
		salesEmployee.setSellcount(1000);
		salesEmployee.setRoyaltyrate(80);
		
		
		Company.showall(hourlyEmployee);
		Company.showall(salariedEmployee);
		Company.showall(salesEmployee);

	}

}
