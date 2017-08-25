package bank.myprojectbank;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

import bank.myprojectbank.Login;
import stringpassword.Pasword;
import stringpassword.check;

public class LoanService extends  Service implements LoanInterface {
	
public LoanService(Customer customer) {
	super(customer);
	}

//	protected static  Customer customer;
	private static int howmanytime=0;
	public  static  double MONTH_ACCURAL=0.004;


	public static double getMONTH_ACCURAL() {
		return MONTH_ACCURAL;
	}

	public static void setMONTH_ACCURAL(double mONTH_ACCURAL) {
		MONTH_ACCURAL = mONTH_ACCURAL;
	}

	public static void loan() {
		if(customer.getCredit()>=3) {
			if(customer.getCar().getMoney()<=1000000000) {
				System.out.println("您的贷款额度为"+customer.getCar().getMoney()*1.5);
//				Scanner scanner=new Scanner(System.in);
				System.out.println("您是否要贷款：Y  N");
				String loan=bank.myprojectbank.Scanner.getInstance().next();
				if(loan.equals("Y")) {
					System.out.println("请输入贷款金额：");
					double loanmoney=bank.myprojectbank.Scanner.getInstance().nextDouble();
					if(loanmoney<=customer.getCar().getMoney()*1.5) {
						System.out.println("请选择还款期限：1、6个月  2、12个月   3、18个月  4、自填");
						int month=bank.myprojectbank.Scanner.getInstance().nextInt();
						loanConditions(loanmoney ,month);
						System.out.println("您已成功贷款"+loanmoney);
						customer.getLoan().setLoanMoney(loanmoney);
						customer.getCar().setMoney(customer.getCar().getMoney()+loanmoney);
						
					}else System.out.println("您的贷款额度为"+customer.getCar().getMoney()*1.5+"您输入的金额太大！");
				}else if(loan.equals("N")) {		
				}
			}else if(customer.getCar().getMoney()>1000000000) {
				System.out.println("sorry！");
			}
		}else {
			System.out.println("您的信用太差不支持贷款！");
		}
	}

	private static void loanConditions( double loanmoney, int temp) {
		double capital=0;
		BigDecimal monthpay;
		double accural=0;

		switch (temp) {
		case 1:
			
			customer.getLoan().setMonth(6);
			for(int i=0;i<6;i++) {
				
				capital=loanmoney*MONTH_ACCURAL*(Math.pow(1+MONTH_ACCURAL, i))/(Math.pow(1+MONTH_ACCURAL, 6)-1);
				accural=loanmoney*MONTH_ACCURAL*(Math.pow(1+MONTH_ACCURAL, 6)-Math.pow(1+MONTH_ACCURAL, i));
				BigDecimal m1=new BigDecimal(capital);
				BigDecimal m2=new BigDecimal(accural);
				monthpay=m1.add(m2);
				System.out.println("第"+(i+1)+"个月应还："+monthpay .setScale(3, BigDecimal.ROUND_CEILING)+"，本金："+m1.setScale(3, BigDecimal.ROUND_CEILING)+"利息："+m2.setScale(3, BigDecimal.ROUND_CEILING));
			
			}
			break;
			
		case 2:
			customer.getLoan().setMonth(12);
			for(int i=0;i<12;i++) {
				capital=loanmoney*MONTH_ACCURAL*(Math.pow(1+MONTH_ACCURAL, i))/(Math.pow(1+MONTH_ACCURAL, 12)-1);
				accural=loanmoney*MONTH_ACCURAL*(Math.pow(1+MONTH_ACCURAL, 12)-Math.pow(1+MONTH_ACCURAL, i));
				BigDecimal m1=new BigDecimal(capital);
				BigDecimal m2=new BigDecimal(accural);
				monthpay=m1.add(m2);
				System.out.println("第"+(i+1)+"个月应还："+monthpay .setScale(3, BigDecimal.ROUND_CEILING)+"，本金："+m1.setScale(3, BigDecimal.ROUND_CEILING)+"利息："+m2.setScale(3, BigDecimal.ROUND_CEILING));
			
			}
			break;
			
		case 3:
			customer.getLoan().setMonth(18);
			for(int i=0;i<18;i++) {
				capital=loanmoney*MONTH_ACCURAL*(Math.pow(1+MONTH_ACCURAL, i))/(Math.pow(1+MONTH_ACCURAL, 18)-1);
				accural=loanmoney*MONTH_ACCURAL*(Math.pow(1+MONTH_ACCURAL, 18)-Math.pow(1+MONTH_ACCURAL, i));
				BigDecimal m1=new BigDecimal(capital);
				BigDecimal m2=new BigDecimal(accural);
				monthpay=m1.add(m2);
				System.out.println("第"+(i+1)+"个月应还："+monthpay .setScale(3, BigDecimal.ROUND_CEILING)+"，本金："+m1.setScale(3, BigDecimal.ROUND_CEILING)+"利息："+m2.setScale(3, BigDecimal.ROUND_CEILING));
			
			}
			break;
	
		case 4:	
//			Scanner scanner=new Scanner(System.in);
			System.out.println("请输入还款期限（月）：");
			int month=bank.myprojectbank.Scanner.getInstance().nextInt();
			customer.getLoan().setMonth(month);
			for(int i=0;i<month;i++) {
				capital=loanmoney*MONTH_ACCURAL*(Math.pow(1+MONTH_ACCURAL, i))/(Math.pow(1+MONTH_ACCURAL, month)-1);
				accural=loanmoney*MONTH_ACCURAL*(Math.pow(1+MONTH_ACCURAL, month)-Math.pow(1+MONTH_ACCURAL, i));
				BigDecimal m1=new BigDecimal(capital);
				BigDecimal m2=new BigDecimal(accural);
				monthpay=m1.add(m2);
				System.out.println("第"+(i+1)+"个月应还："+monthpay .setScale(3, BigDecimal.ROUND_CEILING)+"，本金："+m1.setScale(3, BigDecimal.ROUND_CEILING)+"利息："+m2.setScale(3, BigDecimal.ROUND_CEILING));
			
			}		
			break;
			
		default:
			break;
		}
		
	}
	
	public static void refund() {

		double capital=0;
		double monthpay;
		double accural=0;
		if(howmanytime<customer.getLoan().getMonth()) {
			
					capital=customer.getLoan().getLoanMoney()*MONTH_ACCURAL*(Math.pow(1+MONTH_ACCURAL, howmanytime))/(Math.pow(1+MONTH_ACCURAL, customer.getLoan().getMonth())-1);
					accural=customer.getLoan().getLoanMoney()*MONTH_ACCURAL*(Math.pow(1+MONTH_ACCURAL, customer.getLoan().getMonth())-Math.pow(1+MONTH_ACCURAL,howmanytime));
					monthpay=capital+accural;
					BigDecimal m1=new BigDecimal(capital);
					BigDecimal m2=new BigDecimal(accural);
					BigDecimal m3=m1.add(m2);
					System.out.println("第"+(howmanytime+1)+"个月应还："+m3 .setScale(3, BigDecimal.ROUND_CEILING)+"，本金："+m1.setScale(3, BigDecimal.ROUND_CEILING)+"利息："+m2.setScale(3, BigDecimal.ROUND_CEILING));
				
				System.out.println("确认还款? Y   N");
//				Scanner scanner=new Scanner(System.in);
				String  deny=bank.myprojectbank.Scanner.getInstance().next();
				if(deny.equals("Y")) {
					if(customer.getCar().getMoney()>=monthpay) {
						customer.getCar().setMoney(customer.getCar().getMoney()-monthpay);
						System.out.println("第"+(howmanytime+1)+"个月已还清！");
						System.out.println(customer);
					}else {
						System.out.println("余额不足，请充值！");
					}
				howmanytime++;
			}
		}else System.out.println("已还清所有账单！");
	}
	

}
