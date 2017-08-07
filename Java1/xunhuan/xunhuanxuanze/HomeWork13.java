package xunhuanxuanze;

public class HomeWork13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add1=0,add2=0,add3=0;
		for(int i=1;i<100;i++) {
			if(i%3==0) {
				add1=add1+i;
			}
		}
		System.out.println(add1);
		
		int j=1;
		while(j<100) {
			if(j%3==0) {
				add2=add2+j;
			}
			j++;
		}
		System.out.println(add2);
		
		int k=1;
		do {
			if(k%3==0) {
				add3=add3+k;
			}
			k++;
			
		}while(k<100);
		System.out.println(add3);
	}

}
