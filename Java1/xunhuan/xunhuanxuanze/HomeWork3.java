package xunhuanxuanze;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double money=30000;
		double l=0;
		double all=0;
		for(int i=0;i<10;i++)
		{
			all=all+money;	
			l= (money*0.06);
			money=money+l;
			System.out.println(money);	
		}
		System.out.println(all);

	}

}
