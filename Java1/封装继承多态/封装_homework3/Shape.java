package 封装_homework3;

public abstract class Shape {
	public double area;
	public double per;
	public String color;
	
	
	public Shape() {
		
	}
	
	public Shape(String color) {
		this.color=color;
	}
	
	public double getArea() {	
		return area;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPer() {
		return per;
	}
	
	
	public void showAll() {
		System.out.println("area:"+area+"per:"+per+"color:"+color);
	}


}
