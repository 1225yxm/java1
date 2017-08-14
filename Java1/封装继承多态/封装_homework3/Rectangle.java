package 封装_homework3;

public class Rectangle extends Shape {
	private double length;
	private  double width;


	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Rectangle() {
	}

	public Rectangle(int width2, int length2) {
		this.width=width2;
		this.length=length2;
	}

	public double getArea() {
		double area=1;
		area=width*length;
		return area;
	}
	
	public double getPer() {
		double per=0;
		per=width*2+length*2;
		return per;
	}
	
	public void showAll(double area,double per) {
		System.out.println("长方形：长："+length+"\t宽："+width+"\t面积:"+area+"\t周长："+per);
	}

}
