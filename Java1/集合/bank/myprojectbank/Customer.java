package bank.myprojectbank;

public class Customer {
	private Person person;
	private Car car;
	private Loan loan;
	private  int credit=0;

	public Customer() {
	}

	public Customer(Person person, Car car, int credit) {
		this.person = person;
		this.car=car;
		this.credit=credit;
	}
	
	public Customer(Person person, Car car,Loan loan, int credit) {
		this.person = person;
		this.car=car;
		this.loan=loan;
		this.credit=credit;
	}
	
	
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + ", car=" + car + "]";
	}





	

}
