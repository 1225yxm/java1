package Fangjiazuoye;

public class FangJiaZuoYe8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=1;
		int a=0,b=0;
		int add=0;
		for(i=1;i<100;) {
			while(i%2==0)
			{
				a=a+i;
				i++;
			}
			while(i%2!=0)
			{
				b=b+i;
				i++;
			}
		}
			
			
			for(int x=1;x<100;x++) {
				
				add=add+x;
			}

		System.out.println("100以内偶数和为："+a);
		System.out.println("100以内奇数和为："+b);
		System.out.println("100以所有数和为："+add);
	}

}
