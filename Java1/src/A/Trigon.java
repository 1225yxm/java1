package A;

public class Trigon {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			for (int k=4;k>i;k--) {
				System.out.print(' ');
			}
			for(int j=1;j<i*2;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(int a=0;a<5;a++) {
			for(int b=0;b<a;b++) {
				System.out.print(' ');
			}
			
			for(int c=0;c<7-a*2;c++) {
				System.out.print('*');
			}
			
			System.out.println();
		}
		

	}

}
