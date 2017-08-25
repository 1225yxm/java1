package bank.myprojectbank;

import bank.myprojectbank.Login;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person("0010103230","tom","男");
		Person p2=new Person("0010103231","jack","男");
		
		Car car1=new Car("1234567890", "123456");
		Car car2=new Car("1234567891", "123457");
		
		Loan loan=new Loan();
		
		Customer c1=new Customer(p1,car1,loan,2);
		Customer c2=new Customer(p2,car2,loan,4);
		
		Login login=new Login();
		login.addCustomer(c2);
		login.addCustomer(c1);
			
		Service service=new Service(Login.login());
		BankMenu.manger( );	
		
	}

}
