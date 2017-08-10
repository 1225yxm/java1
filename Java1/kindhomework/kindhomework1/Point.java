package kindhomework1;

public class Point {
	public int x;
	public int y;
	
	
	public Point() {
		
	}
	
	public Point(int x0,int y0) {
		this.x=x0;
		this.y=y0;
	}
	
	public void movePoint(int dx,int dy) {
		this.x=this.x+dx;
		this.y=this.y+dy;
	}
	
	public void PrintPoint() {
		System.out.println("坐标为："+x+"\t"+y);
	}

}
