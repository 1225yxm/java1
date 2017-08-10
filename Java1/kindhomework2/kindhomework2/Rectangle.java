package kindhomework2;

public class Rectangle {
	public int length;
	public int width;

	public Rectangle() {
	}

	public Rectangle(int width2, int length2) {
		this.width=width2;
		this.length=length2;
	}

	public int getArea() {
		int area=1;
		area=width*length;
		return area;
	}
	
	public int getPer() {
		int per=0;
		per=width*2+length*2;
		return per;
	}
	
	public void showAll(int area,int per) {
		System.out.println("长："+length+"\t宽："+width+"\t面积:"+area+"\t周长："+per);
	}

	

}
