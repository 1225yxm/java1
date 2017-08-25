package bank.myprojectbank;

public class BankMenu {
	static String message;
	static String message1;
	static String message2;
	
	public static void manger() {
		
		System.out.println("1、基本业务");
		System.out.println("2、贷款业务");
		message1=bank.myprojectbank.Scanner.getInstance().next();
		if(message1.equals("1")) {
			basicMenu();			
		}else if(message1.equals("2")) {
			loanMenu();
		}
	}
	
	public static void basicMenu() {
		System.out.println("1、存款"+"\t"+"2、取款"+"\t"+"3、转账"+"\t"+"4、修改密码"+"\t"+"5、余额查询");
		System.out.println("请输入选项序号：");
		
	    message=bank.myprojectbank.Scanner.getInstance().next();
		if(message.equals("1")) {
			BasicService.saveMoney();
		}else if(message.equals("2")) {
			BasicService.pullMoney();
		}else if(message.equals("3")) {
			BasicService.turnMoney();
		}else if(message.equals("4")) {
			BasicService.changePassword();
		}else if(message.equals("5")) {
			BasicService.showCustomer();
		} 
		
		changeMenu();
	}
	
	public static void loanMenu() {
		System.out.println("1、贷款"+"\t"+"2、还款");
		
		System.out.println("请输入选项序号：");
		 message=bank.myprojectbank.Scanner.getInstance().next();
		 if(message.equals("1")) {
			 LoanService.loan();
		 } 
		 else if(message.equals("2")) {
			 LoanService.refund();
		 } 
		 
		 changeMenu();
	}
	
	
	public static void changeMenu() {
		System.out.println("1、首页"+"\t"+"2、返回上一页"+"\t"+"3、退出");
	    message2=bank.myprojectbank.Scanner.getInstance().next();
		if(message2.equals("2")) {
			if(message1.equals("1")) basicMenu();
			else if(message1.equals("2"))loanMenu();
		}else if(message2.equals("1")) {
			manger();
		}	else if(message2.equals("3")) {
			System.out.println("已退出系统！");
			System.exit(0);
		}	
		
	}

}
