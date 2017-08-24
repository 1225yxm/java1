package 工厂方法;

public class Test {

	public static void main(String[] args) {
		Product p1;
		Factory  factory=new IphoneFactory();
		p1=factory.product();

	}

}
