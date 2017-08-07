package Fangjiazuoye;

public class FangJiaZuoYe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=0,z=0;
		for(x=0;x<=20;x++) {
			for(y=0;y<=33;y++) {
				for(z=0;z<100;z++) {
					if((x+y+z)==100&&(5*x+3*y+z/3)==100&&(z%3==0)) {
						System.out.print("公鸡："+x);
						System.out.print("母鸡："+y);
						System.out.println("雏鸡："+z);
					}
					
				}
			}
	
		}


	}

}
