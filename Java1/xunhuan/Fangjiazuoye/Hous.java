package Fangjiazuoye;

public class Hous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<11;i++)
		{
			for(int j=10;j>0;j--)
			{
				if(j==10)
				{
					for(;j>i;j--) {
					System.out.print(' ');	
				}
					
				}
				System.out.print('*');	
			}
			
			for(int x=10;x>i;x--) {
				System.out.print('*');	
				
			}
			
			for(int y=0;y<i;y++)
			{
				System.out.print(' ');	
			}
			
			for(int y=0;y<i;y++)
			{
				if(y==(i-1))System.out.print('*');	
				else  System.out.print(' ');	
			}

			System.out.println();
		}
		
		for (int i=0;i<10;i++)
		{

			
			for(int j=0;j<31;j++)
			{
				if(i==0|| i==9||j==30||j==0)System.out.print('*');
				else System.out.print(' ');		
			}
			System.out.println();
		}

	}

}
