package 封装_homework2;

public class Car extends Vehicle {
	private int loader;
	
	public int getLoader() {
		return loader;
	}
	public void setLoader(int loader) {
		this.loader = loader;
	}
	
	public Car(int loader) {
		this.loader=loader;
	}
	
	public Car() {

	}

	public void run() {
		System.out.println("汽车品牌："+getBrand()+"汽车奔跑的速度："+getSpeed()+"汽车颜色："+getColor()+"汽车可载"+loader+"个人");
	}

}
