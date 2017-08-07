package A;

public class SanJiaoXing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			
			for(int j=0;j<i;j++)
			{
				if(i==0||i==9||j==0||j==(i-1)) {
					System.out.print('*');
				}
				else {
					System.out.print('.');
				}
				
			}
			System.out.println("\t \t");
		}
		
		int y;
		int x=0;
		for(x=0;x<10;x++)
		{
			for (y=9;y>x;y--)
			{
				System.out.print('#');
			}
			System.out.println("\t \t");
		}

	}

}
