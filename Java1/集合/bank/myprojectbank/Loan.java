package bank.myprojectbank;

public class Loan {

	private double loanMoney=0;
	private int month=0;
	
	public Loan() {
		
	}

	public Loan(double loanMoney, int month) {
		super();
		this.loanMoney = loanMoney;
		this.month = month;
	}



	public double getLoanMoney() {
		return loanMoney;
	}
	public void setLoanMoney(double loanMoney) {
		this.loanMoney = loanMoney;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	
	
}
