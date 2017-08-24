package bank.myprojectbank;

import bank.myprojectbank.Login;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person("0010103230","tom","男");
		Person p2=new Person("0010103231","jack","男");
		
		Customer c1=new Customer(p1,"1234567890","123456",3);
		Customer c2=new Customer(p2,"1234567891","123457",4);
		
		Login login=new Login();
		login.addCustomer(c2);
		login.addCustomer(c1);
			
		Handler handler=new Handler(Login.login());
		BankMenu.manger( );	
		
	}

}
