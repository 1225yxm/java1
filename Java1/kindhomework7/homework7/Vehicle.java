package homework7;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class Vehicle {
	public String  brand;
	public   String color;
	public  double speed=0;
	
	public   Vehicle() {
		this.brand=getBrand();
		this.color=getColor();
	}
	
	public Vehicle(String brand,String color) {
		this.brand=brand ;
		this.color=color;
	}
	
	public String setBrand(String brand) {
		this.brand=brand;
		return brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String  setColor(String color) {
		this.color=color;
		return color;
	}
	public String getColor() {
		return color;
	}
	
	public void setSpeed(double speed) {
		this.speed=speed;
	}
	public double getSpeed() {
		return speed;
	}
	
	
	
	public void run() {
		System.out.println("汽车品牌："+brand+"汽车奔跑的速度："+speed+"汽车颜色："+color);
	}



}
