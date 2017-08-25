package bank.myprojectbank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bank.myprojectbank.Customer;

public class Login {
	
	private static List<Customer>  customers=new ArrayList<>();

	public static List<Customer> getCustomers() {
		return customers;
	}

	public static void setCustomers(List<Customer> customers) {
		Login.customers = customers;
	}

	public void addCustomer(Customer customer) {
		if(customers.contains(customer)) { 
			System.out.println("该账户已存在");
			}else {
				customers.add(customer);
			}
	}
	
	//登录界面
	public static Customer login ( ) {
		Customer cust=new Customer();
//		Scanner scanner=new Scanner(System.in);
		System.out.println("-------------登录界面----------------");
		int i=0;
		
		for(;i<3;i++) {
			System.out.println("请输入卡号：");
//			String carnb=scanner.next();
			String carnb=bank.myprojectbank.Scanner.getInstance().next();
			System.out.println("请输入密码：");
			String carpw=bank.myprojectbank.Scanner.getInstance().next();
			int min = 1000; // from
			int max = 9999; // to
			Integer result = min + (int) (Math.random() * (max + 1));
			System.out.println(result);
			System.out.println("请输入验证码：");
			String check=bank.myprojectbank.Scanner.getInstance().next();
			
			//判断账号密码
			boolean bn=false,bm=false;
			for (Customer ct2 : customers) {
				if(ct2.getCar().getCardnumber().equals(carnb)) {
					bn=true;
					if(ct2.getCar().getPassword().equals(carpw)) {
						if(check.equals(result.toString())) {
							System.out.println("成功登录！");
							cust=ct2;
							bm=true;
							break;
						}else {
							System.out.println("验证码输入错误，请重新输入："); 
						}
						
						
					}else {
						System.out.println("密码输入错误，请重新输入："); 
					}
				}
		}
			if(bm) break;
			if(!bn) {
				System.out.println("没有该账户请重新输入 ");
			}
		}
		if(i==3) {
			System.out.println("错误次数太多，已退出系统！");
			System.exit(0);
		}
		return cust;
	}
	
}
