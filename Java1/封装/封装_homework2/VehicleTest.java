package 封装_homework2;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle  v1=new Vehicle();
		Vehicle  v2=new Vehicle("benz","red");
		
		v1.setBrand("benz");
		v1.setColor("black");
		v1.run();
		v2.run();
		
		Vehicle  v3=new Vehicle("Honda","red");
		Car c1=new Car(2);
		c1.setVehicle(v3);
		c1.run();

	}

}
