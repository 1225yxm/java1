package 封装_homework2;

public class Car {
	private Vehicle  vehicle;
	private int loader;
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
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
		System.out.println("汽车品牌："+vehicle.getBrand()+"汽车奔跑的速度："+vehicle.getSpeed()+"汽车颜色："+vehicle.getColor()+"汽车可载"+loader+"个人");
	}

}
