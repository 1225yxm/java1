package 封装_homework3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle=new Rectangle();
		rectangle.setLength(3);
		rectangle.setWidth(5);
		rectangle.showAll(rectangle.getArea(),rectangle.getPer());
		
		Circle circle=new Circle();
		circle.setRadius(3);
		circle.showAll(circle.getArea(),circle.getPer());

	}

}
