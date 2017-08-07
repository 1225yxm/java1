package Fangjiazuoye;

public class FangJiaZuoYe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add=0;
		for(int i=1;i<=100;i++)
		{
			if(i%10==3) {
				continue;
			}
			
			add=add+i;
		}
		System.out.println(add);

	}

}
