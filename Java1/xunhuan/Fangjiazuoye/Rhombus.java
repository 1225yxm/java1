package Fangjiazuoye;

public class Rhombus {
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			
				for(int j=9;j>i;j--)
				{
					System.out.print(' ');
				}
			
			
				for (int y=0;y<i;y++)
				{
					if(i==0||y==0) {
						System.out.print('*');
					}
					else {
						System.out.print('.');
					}
				}
				
				for (int y=0;y<i;y++)
				{
					if(i==0||y==(i-1)) {
					System.out.print('*');
				}
				else {
					System.out.print('.');
				}
				
				}
				
				System.out.println();
			
			
		}
		
		for(int a=0;a<10;a++)
		{
			for (int b=0;b<a;b++)
			{
				System.out.print(' ');
			}
			
			for (int c=9;c>a;c--)
			{
				if(a==9||c==9)System.out.print('*');
				else System.out.print('.');
			}
			
			for (int d=9;d>a;d--)
			{
				if(a==9||d==(a+1))System.out.print('*');
				else System.out.print('.');
//				System.out.print('*');
			}
			
			System.out.println();
			
			
			
		}

	}

}
