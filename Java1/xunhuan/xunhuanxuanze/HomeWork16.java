package xunhuanxuanze;

public class HomeWork16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		for (int i=1;;i++) {
				for(int j=2;j<(i-2);j++) {
				a=i%j;
				if(a==0) break;
				else a=i;
			}
				
		 
			if (a>200) {
					System.out.println(a);break;
				}
		}

	}

}
