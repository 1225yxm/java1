package 封装_homework4;

public class SalesEmployee extends ColaEmployee {
	private double sellcount;
	private double royaltyrate;
	
	
	
	public double getSellcount() {
		return sellcount;
	}



	public void setSellcount(double sellcount) {
		this.sellcount = sellcount;
	}



	public double getRoyaltyrate() {
		return royaltyrate;
	}



	public void setRoyaltyrate(double royaltyrate) {
		this.royaltyrate = royaltyrate;
	}



	public double getSalary(int month) {
		double salary=super.getSalary(month);
		salary=salary+sellcount*royaltyrate;
		return salary;
	}
	
}
