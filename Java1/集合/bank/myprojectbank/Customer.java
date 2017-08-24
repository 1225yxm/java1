package bank.myprojectbank;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;

public class Customer {
	private Person person;
	private String cardnumber;
	private String password;
	
	private  int credit=0;
	
	private double loanMoney;
	private int month;

	private double money=0;
	
	
	public Customer() {
	}

	public Customer(Person person, String cardnumber, String password,int credit) {
		this.person = person;
		this.cardnumber = cardnumber;
		this.password = password;
		this.credit=credit;
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

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		BigDecimal mon=new BigDecimal(money);
		return MessageFormat.format(  "name : {0} \t\tcardnumber: {1}\t\tmoney : {2}" , person.getName() , cardnumber , mon.setScale(3,BigDecimal.ROUND_CEILING));
	}


	@Override
	public boolean equals(Object obj) {
		Customer customer1 = this;
		Customer customer2 = (Customer) obj;
		
		if (customer1.getCardnumber() == customer2.getCardnumber()) {
			return true;
		} else {
			return false;
		}
		
	}

}
