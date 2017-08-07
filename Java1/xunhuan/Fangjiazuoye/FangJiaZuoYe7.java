package Fangjiazuoye;

public class FangJiaZuoYe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=0,z=0;
		for(x=0;x<=33;x++) {
			for(y=0;y<=50;y++) {
				for(z=0;z<100;z++) {
					if((x+y+z)==100&&(3*x+2*y+z/2)==100&&(z%2==0)) {
						System.out.print("大马："+x);
						System.out.print("中马："+y);
						System.out.println("小马："+z);
						
					}
				}
			}
		}


	}

}
