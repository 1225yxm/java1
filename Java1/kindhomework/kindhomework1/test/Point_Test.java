package kindhomework1.test;

import kindhomework1.Point;

public class Point_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point();
		Point p2=new Point(2,3);
	
		p2.PrintPoint();
		p2.movePoint(1, 1);
		p2.PrintPoint();

	}

}
