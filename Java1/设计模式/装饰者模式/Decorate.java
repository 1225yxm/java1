package 装饰者模式;

public class Decorate {
	
	private  Swift swift;
	
	public Decorate (Swift swift) {
		this.swift=swift;
	}
	
	public void fly() {
		swift.fly();
	}

}
