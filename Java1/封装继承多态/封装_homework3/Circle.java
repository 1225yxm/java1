package 封装_homework3;

public class Circle extends Shape {
	private double radius;
	
	
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle() {
		
	}
	
	public Circle(double radius,String color) {
		super.color=color;
		this.radius=radius;
		
	}
	
	public double getArea() {
		double area=3.14*radius*radius;
		return area;
	}
	
	public double getPer() {
		double per=0;
		per=2*3.14*radius;
		return per;
	}
	
	public void showAll(double area,double per) {
		System.out.println("圆形：半径："+radius+"\t面积:"+area+"\t周长："+per);
	}

}
