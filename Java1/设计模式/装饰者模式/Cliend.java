package 装饰者模式;

public class Cliend {
	
	public static void main(String[] args) {
		Swift m1=new Monkey();
		m1.fly();
		
		Fish fish=new Fish(m1);
		fish.fly();
		
	}
	
	
	

}
