package bank.myprojectbank;

public class BankMenu {
	
	public static void manger() {
		System.out.println("1、存款");
		System.out.println("2、取款");
		System.out.println("3、转账");
		System.out.println("4、修改密码");
		System.out.println("5、贷款");
		System.out.println("6、还款");
		System.out.println("7、余额查询");
		System.out.println("请输入选项序号：");
//		Scanner scanner=new Scanner(System.in);
		String message=bank.myprojectbank.Scanner.getInstance().next();
		if(message.equals("1")) {
			Handler.saveMoney();
		}else if(message.equals("2")) {
			Handler.pullMoney();
		}else if(message.equals("3")) {
			Handler.turnMoney();
		}else if(message.equals("4")) {
			Handler.changePassword();
		}else if(message.equals("5")) {
			Handler.loan();
		} 
		else if(message.equals("6")) {
			Handler.refund();
		} else if(message.equals("7")) {
			Handler.showCustomer();
		} 
		
		System.out.println("1、返回上个页面");
		System.out.println("2、退出");
		String message2=bank.myprojectbank.Scanner.getInstance().next();
		if(message2.equals("1")) {
			manger();
		}else if(message2.equals("2")) {
			System.exit(0);
		}	
	}

}
