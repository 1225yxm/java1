package homework7;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle  v1=new Vehicle();
		Vehicle  v2=new Vehicle("benz","red");
		Vehicle  v3=new Vehicle();
		v1.setBrand("benz");
		v1.setColor("black");
		v1.run();
		v2.run();
		

	}

}
